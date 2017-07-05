package war.models;

interface ICard {
	// type
	public void setType(CardType _type);
	public CardType getType();
	
	// rank
	public void setRank(CardRank _rank);
	public CardRank getRank();
	public Boolean isGreaterThan(Card card);
}
