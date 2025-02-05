// Deck.java

import java.util.*;

class Deck {
	ArrayList <Card> deck;
	
	public Deck(){
		deck = new ArrayList<>();
	}
	
	public void createDeck() {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
		
		for (String rank: ranks){
			for(String suit: suits){
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	public void displayDeck(){
		for (Card card : deck)
		{
			System.out.println(card);
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	
//Print two randcards from the Deck 
	public void randomCards(){
		shuffleDeck();
		for(int i = 0; i < 3; i++)
		{
			System.out.println(deck.get(i));
		}
	}
	
//Create 3 players and distribute 5 cards at random to a player and display cards of all players
	public void cardPlayers(){
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Player "+(i+1)+"'s hand:");
			for (int j = 0; j < 5; j++)
			{
				System.out.println(deck.remove(0));
			}
			System.out.println();
		}
	}
	
}