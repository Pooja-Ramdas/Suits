// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n--- Card Deck Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Check Same Suit");
            System.out.println("4. Compare Two Cards by Rank");
            System.out.println("5. Find a Card");
            System.out.println("6. Deal 5 Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter first card index: ");
                    int index1 = scanner.nextInt();
                    System.out.print("Enter second card index: ");
                    int index2 = scanner.nextInt();
                    deck.sameCard(index1, index2);
                    break;
                case 4:
                    System.out.print("Enter first card index: ");
                    index1 = scanner.nextInt();
                    System.out.print("Enter second card index: ");
                    index2 = scanner.nextInt();
                    deck.compareCard(index1, index2);
                    break;
                case 5:
                    System.out.print("Enter card rank (2-10, J, Q, K, A): ");
                    String rank = scanner.next();
                    System.out.print("Enter card suit (Hearts, Spades, Clubs, Diamonds): ");
                    String suit = scanner.next();
                    deck.findCard(rank, suit);
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
