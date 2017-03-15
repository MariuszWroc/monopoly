import java.util.List;

public class Player {
	private Integer id;
	private CashRegister cashRegister;
	private List<PlayerCard> playerCards;
	private Card actualPosition;
	
	public Player(Integer id, CashRegister cashRegister, List<PlayerCard> playerCards, Card actualPosition) {
		super();
		this.id = id;
		this.cashRegister = cashRegister;
		this.playerCards = playerCards;
		this.actualPosition = actualPosition;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CashRegister getCashRegister() {
		return cashRegister;
	}

	public void setCashRegister(CashRegister cashRegister) {
		this.cashRegister = cashRegister;
	}

	public List<PlayerCard> getPlayerCards() {
		return playerCards;
	}

	public void setPlayerCards(List<PlayerCard> playerCards) {
		this.playerCards = playerCards;
	}

	public Card getActualPosition() {
		return actualPosition;
	}

	public void setActualPosition(Card actualPosition) {
		this.actualPosition = actualPosition;
	}
	
	
}
