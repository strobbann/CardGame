package se.rosa.cardgame.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.rosa.cardgame.models.Card.Suit;

public class CardTest {

	@Test
	public void cardEquals() {
		Card card = new Card(1, Suit.Heart);
		Card cardShouldNotBeEquals = new Card(1, Suit.Clover);
		Card cardShouldNotBeEquals2 = new Card(2, Suit.Heart);
		Card card2 = new Card(1, Suit.Heart);
		assertEquals(card, card2);
		assertNotEquals(cardShouldNotBeEquals, card);
		assertNotEquals(cardShouldNotBeEquals2, card);

	}

}
