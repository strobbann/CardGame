package se.rosa.cardgame;

import java.io.IOException;

import se.rosa.cardgame.actions.Actions;
import se.rosa.cardgame.models.Card;
import se.rosa.cardgame.repository.Deck;

public class Game {

	public void play(Deck fromDeck, Deck toDeck) throws IOException {

		Actions action = new Actions();
		fromDeck.shuffle();
		System.out.println("Press Enter to start");
		do {
			System.in.read();
			Card card = action.draw(fromDeck);
			System.out.println("\n" + card.toString());
			toDeck.add(card);

		} while (!fromDeck.getCards().isEmpty());

		System.out.println("\nOut of Cards");

	}

	public void printOutSorted(Deck deck) {
		System.out.println("\nSorting");
		deck.sort();
		for (Card c : deck.getCards()) {
			System.out.println("\n" + c.toString());
		}
	}
}
