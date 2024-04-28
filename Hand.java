import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        this.hand.stream()
                .forEach(c -> System.out.println(c));
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new SortBySuit());
    }
    
    @Override
    public int compareTo(Hand other){
        int thisHandValue = this.hand.stream()
                .mapToInt(Card::getValue)
                .sum();
        int otherHandValue = other.hand.stream()
                .mapToInt(Card::getValue)
                .sum();
        
        return Integer.compare(thisHandValue, otherHandValue);
    }
}
