/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
import java.util.*;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart(){
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.items.containsKey(product)){
            this.items.get(product).increaseQuantity();
        }else{
            this.items.put(product, new Item(product,1,price));
        }
    }
    
    public int price(){
        int price = 0;
        for(Item each : items.values()){
            price += each.price();
        }
        return price;
    }
    
    public void print(){
        for(Item each : items.values()){
            System.out.println(each);
        }
    }
}
