
public class Statistics {
    
    private int count, sum;
    
    public Statistics(){}
    
    public void addNumber(int number){
        this.count++;
        this.sum += number;
    }
    
    public int getCount(){
        return count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if(this.count == 0){
            return 0;
        }else {
            return 1.0*this.sum/this.count;
        }
    }
    
}
