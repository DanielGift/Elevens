import java.util.ArrayList;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;






    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an arraylist of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(ArrayList<Integer> values) {

    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays/arraylists to avoid
     * searching for an as-yet-unselected card.
     * @param values is an arraylist of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(ArrayList<Integer> values) {

    }
}
