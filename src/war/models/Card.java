package war.models;

public class Card extends Unique implements ICard {
	private CardType type;
	private CardRank rank;
	
	public Card(CardType type, CardRank rank)
	{
		setId();
		setType(type);
		setRank(rank);
	}
	
	public Card(int id, CardType type, CardRank rank)
	{
		setId(id);
		setType(type);
		setRank(rank);
	}

	@Override
	public void setType(CardType _type) {
		type = _type;
	}

	@Override
	public CardType getType() {
		return type;
	}
	
	@Override
	public void setRank(CardRank _rank) {
		rank = _rank;
	}

	@Override
	public CardRank getRank() {
		return rank;
	}

	@Override
	public Boolean isGreaterThan(Card card) {
		int mass;
		mass = getRank().compareTo(card.getRank());
		
		return (mass > 0);
	}
}
