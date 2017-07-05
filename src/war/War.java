package war;

import java.util.ArrayList;

import war.models.Card;
import war.models.CardRank;
import war.models.CardType;
import war.models.Deck;
import war.models.Player;

public class War implements IWar {
	private Boolean isWar; 
	private int tours;
	private Deck deck;
	private ArrayList<Player> players;
	
	public War(int players, int decks)
	{
		getCards(decks);
		getPlayers(players);
		giveCards();
		
		isWar = true;
		while (isWar)
		{
			tours++;
			battle();
		}
	}

	private void getCards(int amount) {
		deck = new Deck(amount);
		deck.shuffle();
	}

	private void getPlayers(int amount) {
		players = new ArrayList<Player>();
		
		for (int i = 0; i < amount; i++)
		{
			players.add(new Player());
		}
	}

	private void giveCards() {
		Player player;
		
		for (int i = 0; i < deck.size(); i++)
		{
			player = players.get(i % players.size());
			player.addCard(deck.getCard());
		}
	}

	private void battle() {
		Deck stack = new Deck();
		Card card;
		Card bestCard = new Card(CardType.club, CardRank._0);
		Player bestPlayer = null;
		
		for (Player p : players)
		{
			if (p.deckSize() < 1)
			{
				endWar();
				break;
			}
			
			card = p.getCard();
			if (card.isGreaterThan(bestCard))
			{
				bestCard = card;
				bestPlayer = p;
			}
			
			stack.addCard(card);
		}
		
		for (Card c : stack.getCards())
		{
			bestPlayer.addCard(c);
		}
	}

	private void endWar() {
		isWar = false;
		System.out.println("Koniec wojny po " + tours + " turach");
	}

}
