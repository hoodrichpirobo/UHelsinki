package application;
import java.util.*;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
    @Override
    public boolean isOn(){
       for(Sensor each : this.sensors){
           if(!each.isOn()){
               return false;
           }
       }
       return true;
    }
    
    @Override
    public void setOn(){
        for(Sensor each : this.sensors){
            each.setOn();
        }
    }
    
    @Override
    public void setOff(){
        this.sensors.get(0).setOff();
    }
    
    @Override
    public int read(){
        if(!this.isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException("");
        }        
        int sum = this.sensors.stream()
                .mapToInt(s -> s.read())
                .sum();
        this.readings.add(sum/this.sensors.size());
        return sum/this.sensors.size();
    }
}
