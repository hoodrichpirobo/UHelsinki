public class Person {
    private String name;
    private Education ed;
    
    public Person(String name, Education ed){
        this.name = name;
        this.ed = ed;
    }
    
    public Education getEducation(){
        return this.ed;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.getEducation();
    }
}
