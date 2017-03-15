import java.util.List;

public class PlayerCard {
	private Card card;
	private List<Pawn> pawns;
	
	public PlayerCard(Card card, List<Pawn> pawns) {
		this.card = card;
		this.pawns = pawns;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<Pawn> getPawns() {
		return pawns;
	}

	public void setPawns(List<Pawn> pawns) {
		this.pawns = pawns;
	}

	@Override
	public String toString() {
		return "PlayerCard [card=" + card + ", pawns=" + pawns + "]";
	}
	
}
