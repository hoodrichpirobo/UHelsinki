
import java.util.*;

public class BigYear{

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Add")){
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in latin: ");
                String nameInLatin = scan.nextLine();
                birds.add(new Bird(name, nameInLatin));
            }else if(command.equals("Observation")){
                System.out.println("Bird? ");
                String name = scan.nextLine();
                int appears = 0;
                for(Bird each : birds){
                    if(each.getName().equals(name)){
                        each.observe();
                        appears++;
                    }
                }
                
                if(appears == 0){
                    System.out.println("Not a bird!");
                }
            }else if(command.equals("All")){
                for(Bird each : birds){
                    System.out.println(each);
                }
            }else if(command.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                for(Bird each : birds){
                    if(each.getName().equals(name)){
                        System.out.println(each);
                    }
                }
            }else if(command.equals("Quit")){
                break;
            }
        }

    }
    
    static class Bird{
        
        private String name;
        private String nameInLatin;
        private int observations;
        
        public Bird(String name, String nameInLatin){
            this.name = name;
            this.nameInLatin = nameInLatin;
            this.observations = 0;
        }
        
        public String getName(){
            return this.name;
        }
        
        public void observe(){
            this.observations++;
        }
        
        public String toString(){
            return this.name + " (" + this.nameInLatin + "): " + this.observations + " observations";
        }
    }

}
