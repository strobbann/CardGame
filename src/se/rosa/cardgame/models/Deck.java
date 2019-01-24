package se.rosa.cardgame.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deck implements Comparator<Card> {
	private List<Card> cards;

	public Deck() {
		this.cards = new ArrayList<>();
	}

	public Deck shuffle() {
		Collections.shuffle(cards);
		return this;
	}

	public Deck add(Card card) {
		cards.add(card);
		return this;
	}

	public Deck sort() {
		Collections.sort(cards, this);
		return this;
	}

	public List<Card> getCards() {
		return cards;
	}

	public Card get(int index) {
		return cards.get(index);
	}

	public Card remove(int index) {
		return cards.remove(index);
	}

	@Override
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}

	@Override
	public int compare(Card o1, Card o2) {
		if (o1.getSuitValue() > o2.getSuitValue()) {
			return 1;
		} else if (o1.getSuitValue() < o2.getSuitValue()) {
			return -1;
		} else if (o1.getValue() > o2.getValue()) {
			return 1;
		} else if (o1.getValue() < o2.getValue()) {
			return -1;
		}
		return 0;
	}
}
