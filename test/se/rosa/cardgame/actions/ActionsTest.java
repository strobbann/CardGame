package se.rosa.cardgame.actions;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.rosa.cardgame.models.Card;
import se.rosa.cardgame.models.Card.Suit;
import se.rosa.cardgame.models.Deck;

public class ActionsTest {
	private Actions actions;
	private Deck deck;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		actions = new Actions();
		deck = actions.generateNewDeck();
	}

	@Test
	public void GeneratesDeck() {

		assertNotNull(deck);
		assertSame(52, deck.getCards().size());
	}

	@Test
	public void ShufflesDeck() {
		int index = 1;
		Card card = deck.getCards().get(index);
		deck.shuffle();
		assertNotNull(deck);
		assertNotSame(card, deck.getCards().get(index));
	}

	@Test
	public void sortDeckHeartsDiamondCloverSpadeAce23() {
		Card heartAce = new Card(1, Suit.Heart);
		Card heart2 = new Card(2, Suit.Heart);
		Card heart3 = new Card(3, Suit.Heart);
		Card diamondAce = new Card(1, Suit.Diamond);
		Card diamond2 = new Card(2, Suit.Diamond);
		Card diamond3 = new Card(3, Suit.Diamond);
		Card cloverAce = new Card(1, Suit.Clover);
		Card clover2 = new Card(2, Suit.Clover);
		Card clover3 = new Card(3, Suit.Clover);
		Card spadeAce = new Card(1, Suit.Spade);
		Card spade2 = new Card(2, Suit.Spade);
		Card spade3 = new Card(3, Suit.Spade);
		deck.shuffle();
		deck.sort();
		assertEquals(heartAce, deck.get(0));
		assertEquals(heart2, deck.get(1));
		assertEquals(heart3, deck.get(2));
		assertEquals(diamondAce, deck.get(13));
		assertEquals(diamond2, deck.get(14));
		assertEquals(diamond3, deck.get(15));
		assertEquals(cloverAce, deck.get(26));
		assertEquals(clover2, deck.get(27));
		assertEquals(clover3, deck.get(28));
		assertEquals(spadeAce, deck.get(39));
		assertEquals(spade2, deck.get(40));
		assertEquals(spade3, deck.get(41));
	}

	@Test
	public void drawCard() {
		deck.shuffle();
		deck.sort();
		Card heartAce = new Card(1, Suit.Heart);
		Card card = actions.draw(deck);
		assertFalse(deck.getCards().contains(heartAce));
		assertEquals(heartAce, card);
	}

}
