package war.models;

public interface IPlayer {	
	// deck
	public void setDeck(Deck _deck);
	public Deck getDeck(); 
	public void addCard(Card card);
	public Card getCard();
	public int deckSize();
}
