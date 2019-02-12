/**
 * This is a class that tests the Deck class.
 */
package Activity2;

public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clovers"};
		String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		
		Deck deck1 = new Deck(ranks, suits, values);
		Deck deck2 = new Deck(ranks, suits, values);
		Deck deck3 = new Deck(ranks, suits, values);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.toString());
		System.out.println(deck3.deal());
		
	}
}
