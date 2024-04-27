import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LiteracyComparison {
    public static void main(String[] args) {
        List<String> lines = read("literacy.csv");
        List<country> countries = new ArrayList<>();
        for(String each : lines){
            String[] parts = each.trim().split(",");
            countries.add(new country(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])));
        }
        countries.stream()
                .sorted(Comparator.comparingDouble(country::getRate))
                .forEach(c -> System.out.println(c));
    }
    
    public static List<String> read(String file){
        List<String> lines = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(file)).forEach(line -> lines.add(line));
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return lines;
    }
    
    public static class country{
        String name, gender;
        int year;
        double rate;
        
        public country(String name, int year, String gender, double rate){
            this.name = name;
            this.year = year;
            this.gender = gender.equals(" female (%)") ? "female" : "male";
            this.rate = rate;
        }
        
        public double getRate(){
            return this.rate;
        }
        
        @Override
        public String toString(){
            return this.name + " (" + this.year + "), " + this.gender + ", " + this.rate;
        }
    }
}
