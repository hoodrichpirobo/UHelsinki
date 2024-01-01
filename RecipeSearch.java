
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            int i = 0;
            
            while(scan.hasNextLine()){
                String name = scan.nextLine().trim();
                
                int time = Integer.valueOf(scan.nextLine());
                recipes.add(new Recipe(name, time));

                while(scan.hasNextLine()){
                    String line = scan.nextLine();
                    if(line.isEmpty()) break;
                    recipes.get(i).addIngredient(line);
                }                
                i++;
            }
            
            
        }catch(Exception e){}
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while(true){
            System.out.println("");
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if(command.equals("list")){
                list(recipes);
            } else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                findName(recipes, name);
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                findTime(recipes, time);
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                findIngredient(recipes,ingredient);
            }else if(command.equals("stop")){
                break;
            }
        }
    }   
    
    public static void findIngredient(ArrayList<Recipe> recipes, String ingredient){
        System.out.println("");
        System.out.println("Recipes: ");
        for(Recipe each : recipes){
            if(each.isIngredientThere(ingredient)){
                System.out.println(each);
            }
        }
    }
    
    public static void findTime(ArrayList<Recipe> recipes, int time){
        System.out.println("");
        System.out.println("Recipes: ");               
        for(Recipe each : recipes){
            if(each.getTime() <= time){
                System.out.println(each);
            }
        }
    }
    
    public static void findName(ArrayList<Recipe> recipes, String name){
        System.out.println("");
        System.out.println("Recipes: ");        
        for(Recipe each : recipes){
            if(each.getName().contains(name)){
                System.out.println(each);
            }
        }
    }
    
    public static void list(ArrayList<Recipe> recipes){
        
        System.out.println("");        
        System.out.println("Recipes: ");
        
        for(Recipe each : recipes){
            System.out.println(each);
        }
    }
    
    static class Recipe {
    
        private String name;
        private int time;
        private ArrayList<String> ingredients;
                

        public Recipe(String name, int time){
            this.name = name;
            this.time = time;
            this.ingredients = new ArrayList<>();
        }

        public String getName(){
            return this.name;
        }

        public int getTime(){
            return this.time;
        }
        
        public void addIngredient(String line){
            this.ingredients.add(line);
        }
        
        public void printIngredients(){
            System.out.println(this.ingredients.toString());
        }
        
        public boolean isIngredientThere(String ingredient){
            for(String each : ingredients){
                if(each.equals(ingredient)){
                    return true;
                }
            }
            
            return false;
        }
        
        public String toString(){
            return this.name + ", cooking time: " + this.time;
        }
    
    }

}
