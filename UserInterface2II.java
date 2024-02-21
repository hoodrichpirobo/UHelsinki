
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
    public class UserInterface2II{
        
        private TodoList list;
        private Scanner scanner;
        
        public UserInterface2II(TodoList list, Scanner scanner){
            this.list = list;
            this.scanner = scanner;
        }
        
        public void start(){
            while(true){
                System.out.println("Command: ");
                String command = scanner.nextLine();
                if(command.equals("stop")){
                    break;
                }
                if(command.equals("add")){
                    System.out.println("To add: ");
                    String nextTask = scanner.nextLine();
                    this.list.add(nextTask);
                }
                if(command.equals("list")){
                    this.list.print();
                }
                if(command.equals("remove")){
                    System.out.println("Which one is removed? ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    this.list.remove(number);
                }
            }
            
        }
    }
