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
    public class TodoListII{
        
        private ArrayList<String> tasks;
        
        public TodoListII(){
            this.tasks = new ArrayList<>();
        }
        
        public void add(String task){
            this.tasks.add(task);
        }
        
        public void print(){
            int i = 1;
            for(String str : this.tasks){
                System.out.println(i + ": " + str);
                i++;
            }
        }
        
        public void remove(int number){
            this.tasks.remove(number-1);
        }
    }
