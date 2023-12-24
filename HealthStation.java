
public class HealthStation {

    private int WeighingsCounter = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        
        this.WeighingsCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight+1);
    }
    
    public int weighings(){
        return this.WeighingsCounter;
    }

}
