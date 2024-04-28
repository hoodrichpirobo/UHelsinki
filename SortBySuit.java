import java.util.*;

public class SortBySuit implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2){
        if(c1.getSuit().ordinal()==c2.getSuit().ordinal()){
            return c1.getValue() - c2.getValue();
        }
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
