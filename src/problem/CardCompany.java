package problem;

public class CardCompany {
	private static int num = 0;
	private static CardCompany cardCompany = new CardCompany();
	private CardCompany() {}
	public static CardCompany getCardCompany() {
		if(cardCompany == null) {
			cardCompany = new CardCompany();
		}
		return cardCompany;
	}
	public Card makeCard() {
		Card card = new Card();
		card.cardNum = this.num;
		this.num++;
		return card;
	}
}
