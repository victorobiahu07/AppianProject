package CardsWithFriends;

import java.util.*;

public class Card{

	enum Suit {
		CLUB,
		DIAMOND,
		HEART, 
		SPADE;
	}

	enum Rank
	{
		ACE, 
		TWO, 
		THREE, 
		FOUR, 
		FIVE, 
		SIX, 
		SEVEN, 
		EIGHT, 
		NINE, 
		TEN, 
		JACK, 
		QUEEN, 
		KING; 

	}

	private final Rank rank;
	private final Suit suit;


	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank()
	{
		return rank;
	}

	public Suit getSuit()
	{
		return suit;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}

}



