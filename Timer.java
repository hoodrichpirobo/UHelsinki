public class Timer {
    
    private int ms;
    private int s;
    
    public Timer(){
        this.ms = 0;
        this.s = 0;
    }
    
    @Override
    public String toString(){
        return ((s>9) ? s : ("0" + s)) + ":" + ((ms>9) ? ms : ("0" + ms));
    }
    
    public void advance(){
        this.ms++; 
        if(this.ms>=100){
            this.ms = 0;
            this.s++;
        }
            
        if (s>=60){
            s=0;
        }
        
    }
    
}
