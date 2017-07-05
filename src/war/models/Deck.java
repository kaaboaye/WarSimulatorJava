package war.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck implements IDeck {
	private ArrayList<Card> cards;
	
	public Deck()
	{
		ArrayList<Card> _cards = new ArrayList<Card>();
		setCards(_cards);
	}
	
	public Deck(int decks)
	{
		cards = new ArrayList<Card>();
		
		for (int i = 0; i < decks; i++)
		{
			addCards();
		}
	}

	@Override
	public void setCards(ArrayList<Card> list) {
		cards = list;
	}

	@Override
	public void addCards() {
		for (CardRank r : CardRank.values())
		{
			for (CardType t : CardType.values())
			{
				if (r == CardRank.jocker && t == CardType.spade)
				{
					continue;
				}
				
				addCard(new Card(t, r));
			}
		}
	}

	@Override
	public void addCard(Card card) {
		cards.add(0, card);
	}

	@Override
	public ArrayList<Card> getCards() {
		ArrayList<Card> _cards = cards;
		cards.clear();
		return _cards;
	}

	@Override
	public Card getCard() {
		int lastCard = cards.size() - 1;
		Card card = cards.get(lastCard);
		cards.remove(lastCard);
		return card;
	}

	@Override
	public void shuffle() {
		Collections.shuffle(cards, new Random());
	}

	@Override
	public int size() {
		return cards.size();
	}
}
