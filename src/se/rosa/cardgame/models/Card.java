package se.rosa.cardgame.models;

public class Card {
	private int value;
	private Suit suit;
	private int suitValue;

	public enum Suit {
		Heart, Diamond, Clover, Spade
	}

	public enum NamedCard {
		Ace, Knight, Queen, King
	}

	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
		this.suitValue = suit.ordinal();
	}

	public int getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getSuitValue() {
		return suitValue;
	}

	@Override
	public String toString() {
		switch (value) {
		case 1:
			return String.format("%s %s", NamedCard.Ace, suit);
		case 11:
			return String.format("%s %s", NamedCard.Knight, suit);
		case 12:
			return String.format("%s %s", NamedCard.Queen, suit);
		case 13:
			return String.format("%s %s", NamedCard.King, suit);
		}
		return String.format("%s %s", value, suit);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suit != other.suit)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

}
