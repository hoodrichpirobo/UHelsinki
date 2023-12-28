import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 5, 1, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array,0));
        System.out.println(indexOfSmallestFrom(array,1));
        System.out.println(indexOfSmallestFrom(array,3));
        
        System.out.println(Arrays.toString(array));
        
        swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
        
        swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
        
        sort(array);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int each : array){
            if(each < smallest){
                smallest = each;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int i = 0;
        
        for(int each: array){
            if(each == smallest(array)){
                break;
            }
            i++;
        }
        
        return i;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int[] Copy = new int[array.length - startIndex];
        
        for(int i = startIndex; i < array.length; i++){
            Copy[i-startIndex] = array[i];
        }
        
        return (indexOfSmallest(Copy)+startIndex);
    }
    
    public static void swap(int[] array, int index1, int index2){
        int aux = array[index2];
        array[index2] = array[index1];
        array[index1] = aux;
    }
    
    public static void sort(int[] array){
        
        System.out.println(Arrays.toString(array));
        
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }
        
    }

}
