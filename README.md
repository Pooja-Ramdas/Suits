# Suits - Card Deck Java Program
## Description
This is a Java program that simulates a deck of playing cards. It allows users to perform various operations such as printing the deck, shuffling, finding specific cards, dealing cards, and comparing them. Folloeing are its features:
-> Create a deck of 52 playing cards
-> Print all cards in the deck
-> Display a specific card
-> Check if two cards have the same suit
->Compare two cards by rank
-> Find a specific card
-> Shuffle the deck
-> Deal 5 random cards

## List of Variables
| Variable Name | Data Type      | Use |
|--------------|--------------|-----|
| `rank`       | `String`      | Stores the rank of a card (2-10, J, Q, K, A) |
| `suit`       | `String`      | Stores the suit of a card (Hearts, Spades, Clubs, Diamonds) |
| `deck`       | `ArrayList<Card>` | Stores the deck of 52 playing cards |
| `scanner`    | `Scanner`     | Takes user input in the menu-driven program |
| `choice`     | `int`         | Stores the user's menu selection |
| `index`      | `int`         | Stores an index value for selecting a card |

## List of Functions
| Function Name  | Return Type   | Use |
|---------------|--------------|-----|
| `Card(String rank, String suit)` | `Constructor` | Initializes a card with a given rank and suit |
| `getRank()`   | `String`      | Returns the rank of the card |
| `getSuit()`   | `String`      | Returns the suit of the card |
| `toString()`  | `String`      | Returns a string representation of a card |
| `sameSuit(Card other)` | `boolean` | Checks if two cards have the same suit |
| `sameRank(Card other)` | `boolean` | Checks if two cards have the same rank |
| `Deck()`      | `Constructor` | Initializes an empty deck of cards |
| `createDeck()` | `void`       | Creates a deck of 52 playing cards |
| `printDeck()` | `void`       | Prints all cards in the deck |
| `printCard(int index)` | `void` | Prints a specific card from the deck |
| `sameCard(int index1, int index2)` | `void` | Checks if two cards have the same suit |
| `compareCard(int index1, int index2)` | `void` | Compares two cards by rank |
| `findCard(String rank, String suit)` | `void` | Finds a card based on rank and suit |
| `shuffleDeck()` | `void`      | Shuffles the deck randomly |
| `dealCard()`  | `void`       | Deals 5 random cards from the deck |
| `main(String[] args)` | `void` | Runs the menu-driven program |


