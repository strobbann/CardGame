package se.rosa.cardgame;

import java.io.IOException;

import se.rosa.cardgame.actions.Actions;
import se.rosa.cardgame.models.Deck;

public class Main {

	public static void main(String[] args) throws IOException {
		Actions action = new Actions();
		Deck fromDeck = action.generateNewDeck();
		Deck toDeck = new Deck();
		Game game = new Game();
		game.play(fromDeck, toDeck);
		game.printOutSorted(toDeck);
	}

}
