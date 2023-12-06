
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Name: ");
        String team = scan.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            
            ArrayList<String> teams = new ArrayList<>();
            ArrayList<String> winners = new ArrayList<>();
            int i = 0, j = 0;
            
            while(fileReader.hasNextLine()){
                String[] parts = fileReader.nextLine().split(",");
                teams.add(parts[0]); 
                teams.add(parts[1]);
                
                if(Integer.valueOf(parts[2])>Integer.valueOf(parts[3])){
                    winners.add(parts[0]);
                }else {
                    winners.add(parts[1]);
                }
            }
            
            for(String each : teams){
                if (team.equals(each))
                    i++;
            }
            
            for(String each : winners){
                if(team.equals(each))
                    j++;
            }
            
            System.out.println("Games: " + i);
            System.out.println("Wins: " + j);
            System.out.println("Losses: " + (i-j));
            
        }catch (Exception e){}
        
    }

}
