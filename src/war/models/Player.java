package war.models;

public class Player extends Unique implements IPlayer {
	private Deck deck;
	
	public Player() {
		setId();
		setDeck(new Deck());
	}

	@Override
	public void setDeck(Deck _deck) {
		deck = _deck;
	}

	@Override
	public Deck getDeck() {
		return deck;
	}

	@Override
	public void addCard(Card card) {
		deck.addCard(card);		
	}

	@Override
	public Card getCard() {
		return deck.getCard();
	}

	@Override
	public int deckSize() {
		return deck.size();
	}
}
