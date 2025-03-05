// Deck.java

import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create and initialize deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Print a specific card
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index! Card does not exist.");
        }
    }

    // Check if two cards belong to the same suit
    public void sameCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            if (deck.get(index1).sameSuit(deck.get(index2))) {
                System.out.println("The cards have the same suit.");
            } else {
                System.out.println("The cards have different suits.");
            }
        } else {
            System.out.println("Invalid indices!");
        }
    }

    // Compare two cards by rank
    public void compareCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            if (deck.get(index1).sameRank(deck.get(index2))) {
                System.out.println("The cards have the same rank.");
            } else {
                System.out.println("The cards have different ranks.");
            }
        } else {
            System.out.println("Invalid indices!");
        }
    }

    // Find a specific card by rank and suit
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found in the deck.");
    }

    // Deal 5 random cards from the deck
    public void dealCard() {
        shuffleDeck();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.remove(0)); // Remove and print card
        }
    }

    // Shuffle the deck randomly
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
