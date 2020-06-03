package CardsWithFriends;
import java.util.*;


import CardsWithFriends.Card.Rank;
import CardsWithFriends.Card.Suit;


class DeckOfCards {

	public static final int DECK_SIZE = 52;
	private final Card[] cards = new Card[DECK_SIZE];
	private final Card[] drawnCards =  new Card[DECK_SIZE];

	int currentCard = 0;

	DeckOfCards() 
	{
		int currentCardIndex = 0;

		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards[currentCardIndex++] = new Card(rank, suit);
			}
		}
	}

	Card[] getCards() 
	{
		return cards;
	}


	Card getCard(int index)
	{
		return cards[index];
	}


	void shuffleDeck() {
		Random rand = new Random();

		for (int i = 0; i < DECK_SIZE; i++) 
		{

			int j = rand.nextInt(DECK_SIZE);
			swapCards(i, j);
		}
	}

	void swapCards(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}


	public void dealCard()
	{
		// determine whether Cards remain to be dealt
		//was currentCard at first.. putting currentCardIndex
		
		if ( currentCard < DECK_SIZE)
			System.out.println(cards[currentCard++].toString()); 

		else       
			System.out.println("You have run out of cards");
	} 
	
	
	public void resetCardDeck()
	{
		DeckOfCards resetDeck = new DeckOfCards();
		currentCard =0;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Appian Playing Card Deck Demo: \n");

		for (int i = 0; i < DECK_SIZE; i++) {
			stringBuilder.append("Card #" + (i + 1) + ": " + getCard(i) + "\n");
		}

		return stringBuilder.toString();
	}


	//Main Method for testing shuffle and dealCard
	public static void main(String[] args)
	{
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.shuffleDeck();
		System.out.println(deckOfCards.toString());


		//Method to illustrate dealing more than 52 cards.
		for(int i = 0; i < 54; i++)
		{
			System.out.print("Card # " + (i+1) + " dealt: ");
			deckOfCards.dealCard();
		}
		
		//get new playing deck and test more functions.
		deckOfCards.resetCardDeck();	
		deckOfCards.shuffleDeck();
		System.out.println("\n" + "Card deck successfully reset, enjoy your new game: ");
		
		
		System.out.println(deckOfCards.toString());
		System.out.println("Dealing new card: ");
		deckOfCards.dealCard();
		

	}

}

