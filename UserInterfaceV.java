package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.sql.*;
import java.util.*;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            
            if(command.equals("1")){
                System.out.println("Listing the database contents");
                for(Todo each : this.database.list()){
                    System.out.println(each);
                }
            }
            
            if(command.equals("2")){
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter description");
                String description = scanner.nextLine();
                this.database.add(new Todo(name, description, false));
            }
            
            if(command.equals("3")){
                System.out.println();
                System.out.println("Which todo should be marked as done (give the id)?");
                int id = Integer.parseInt(scanner.nextLine());
                this.database.markAsDone(id);
            }
            
            if(command.equals("4")){
                System.out.println();
                System.out.println("Which todo should be removed (give the id)?");
                int id = Integer.parseInt(scanner.nextLine());
                this.database.remove(id);
            }
        }

        System.out.println("Thank you!");
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
