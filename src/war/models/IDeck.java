package war.models;

import java.util.ArrayList;

interface IDeck {
	// cards
	public void setCards(ArrayList<Card> list);
	public ArrayList<Card> getCards();
	public void addCards();
	public void addCard(Card card);
	public Card getCard();
	public void shuffle();
	public int size();
}
