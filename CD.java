/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class CD implements Packable {
    private String artist;
    private String cd;
    private int year;
    private double weight;
    
    public CD(String artist, String cd, int year){
        this.artist = artist;
        this.cd = cd;
        this.year = year;
        this.weight = 0.1;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.cd + " (" + this.year + ")";
    }
}