package blackjack;

public class Dealer {
	int numberOfCards;
	int currentCardValue;
	String cardName;
	
	public Dealer(int cards, int value, String name) {
		numberOfCards = cards;
		currentCardValue = value;
		cardName = name;
	}

}
