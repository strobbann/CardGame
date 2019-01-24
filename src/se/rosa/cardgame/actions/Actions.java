package se.rosa.cardgame.actions;

import se.rosa.cardgame.models.Card;
import se.rosa.cardgame.repository.Deck;


public class Actions {

	public Deck generateNewDeck() {
		Deck deck = new Deck();
		for (int i = 0; i < Card.Suit.values().length; i++) {
			for (int j = 1; j <= 13; j++) {
				Card card = new Card(j, Card.Suit.values()[i]);
				deck.add(card);
			}
		}
		return deck;
	}

	public Deck sort(Deck deck) {
		return deck.sort();
	}

	public Card draw(Deck deck) {
		Card card = deck.get(0);
		deck.remove(0);
		return card;
	}

}
