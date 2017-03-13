
public enum Money {
	ONE(1),
	FIVE(5),
	TEN(10),
	TWENTY(20),
	FIFTY(50),
	ONE_HUNDRET(100),
	FIVE_HUNDRET(500);
	
	private Integer value;
	
	private Money(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}
