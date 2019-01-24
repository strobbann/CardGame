package se.rosa.cardgame;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.rosa.cardgame.models.Deck;
import se.rosa.cardgame.models.Card;
import se.rosa.cardgame.models.Card.Suit;

public class GameTest {

	@Test
	public void shouldEndWhenDeckIsEmpty() throws IOException {
		Deck fromDeck = new Deck();
		Card card = new Card(1, Suit.Heart);
		fromDeck.add(card);
		Deck toDeck = new Deck();
		Game game = new Game();
		game.play(fromDeck, toDeck);
		assertTrue(fromDeck.getCards().isEmpty());
		assertEquals(card, toDeck.get(0));

	}

}
