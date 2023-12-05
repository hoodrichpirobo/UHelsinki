/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class Book {
    private String title;
    private int pages;
    private int years;

    public Book(String title, int pages, int years){
        this.title = title;
        this.pages = pages;
        this.years = years;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.years;
    }
    
    public String getTitle(){
        return this.title;
    }
}
