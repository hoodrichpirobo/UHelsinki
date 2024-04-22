/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class Book4 implements Packable {
    private String author;
    private String book;
    private double weight;
    
    public Book4(String author, String book, double weight){
        this.author = author;
        this.book = book;
        this.weight = weight;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.author + ": " + this.book;
    }
}
