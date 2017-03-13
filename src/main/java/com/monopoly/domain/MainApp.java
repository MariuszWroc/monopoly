import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.omg.Messaging.SyncScopeHelper;

public class MainApp {

	public static void main(String[] args) {
		String path = "C:\\opt\\nokia\\network\\data\\pico";
		String emsName = "PicoRBS6501_192.168.1.1";
		try {
			getDumpStream(getMostRecentDumpZipArchive(path, emsName), "ATLRGAESPCOLTE0238849", "kupa");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void test() {
		List<String> list = new ArrayList<>();
		File folder = new File("C:\\opt\\nokia\\network\\data\\ERC_EEGS\\austdocems1\\austdocems1");
		File[] listOfFiles = folder.listFiles();
		
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
//		        System.out.println("File " + listOfFiles[i].getName());
		    	  String name = listOfFiles[i].getName();
		    	  name.replaceAll(".xml", "");
		        list.add(name);
		      } else if (listOfFiles[i].isDirectory()) {
//		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
		    System.out.println(list.size());
		    List<String> foundItems = new ArrayList<>();
		    Charset charset = Charset.forName("US-ASCII");
		    Path file = Paths.get("C:\\opt\\nokia\\network\\data\\ERC_EEGS\\austdocems1\\GDOSystemAudit.austdocems1b.03.30.2016.06h40m19s.xml");
			try (BufferedReader reader = Files.newBufferedReader(file , charset)) {
		        String line = null;
		        while ((line = reader.readLine()) != null) {
		        	for(String oneItem : list) {
		        		if (line.contains(oneItem)) {
		        			foundItems.add(oneItem);
		        		}
		        	}
		        }
		    } catch (IOException x) {
		        System.err.format("IOException: %s%n", x);
		    }
			
			System.out.println("Results");
			foundItems.forEach(item -> System.out.println(item));
	}
	
	public static void compareResultIsTrue() throws IOException {
		String pathToCorrectData = "/opt/nokia/network/data/ERC_CSP/ERC_CSP/ERC_CSP";
		String pathToResultData = "/opt/nokia/network/data/correct_csp";
		
		File directoryWithCorrectData = new File(pathToCorrectData);
		List<String> displayCorrectData =null;
		displayCorrectData.sort((p1, p2) -> p1.compareTo(p2));
		displayCorrectData.forEach(name -> System.out.println(name));

		File directoryWithResultData = new File(pathToResultData);
		List<String> displayResultData = null;
		displayResultData.sort((p1, p2) -> p1.compareTo(p2));
		displayResultData.forEach(name -> System.out.println(name));
		
		
		Map<String, String> resultMap = new HashMap<>();//resultMap.stream().collect(Collectors.toMap(displayCorrectData -> displayCorrectData, displayResultData -> displayResultData));
	}
	public static File getMostRecentDumpZipArchive(String dumpFileDirectory, String emsName) throws IOException {
        File directory = new File(dumpFileDirectory);
System.out.println(directory.isDirectory());
        SortedMap<String, File> sorted = new TreeMap<>();

        File[] files = directory.listFiles((dir, name) -> name.startsWith(emsName));
        if (files != null && files.length != 0) {
            for (File file : files) {
            	System.out.println(file.getName());
                int length = file.getName().length();
                String timestamp = file.getName().substring(file.getName().lastIndexOf("_"), file.getName().lastIndexOf("."));
                sorted.put(timestamp, file);
            }
            if (!sorted.isEmpty()) {
                return sorted.get(sorted.lastKey());
            }
        }
        throw new FileNotFoundException("Could not find dump ZIP archive for EMS = " + emsName);
    }
	
    public static InputStream getDumpStream(File dumpZipArchive, String networkElementName, String fileSuffix) throws IOException {

        @SuppressWarnings("resource")
		ZipFile directory = new ZipFile(dumpZipArchive.getPath());

        Enumeration<? extends ZipEntry> entries = directory.entries();

        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            System.out.println(entry.getName());
            if (entry.getName().contains(networkElementName) && entry.getName().endsWith("_" + fileSuffix + ".xml")) {
            	
                return directory.getInputStream(entry);
            }
        }
        throw new FileNotFoundException("Could not find " + fileSuffix + " dump file in " + dumpZipArchive.getName() + " ZIP archive for NE = " + networkElementName);
    }

}
