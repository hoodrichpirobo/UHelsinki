public class Checker {
    private String daysOfWeek;
    private String vowels;
    private String time;
    
    public Checker(){
        this.daysOfWeek = "(mon|tue|wed|thu|fri|sat|sun)";
        this.vowels = "[aeiou]*";
        this.time = "([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
    }
    
    public boolean isDayOfWeek(String string){
        return string.matches(this.daysOfWeek);
    }
    
    public boolean allVowels(String string){
        return string.matches(this.vowels);
    }
    
    public boolean timeOfDay(String string){
        return string.matches(this.time);
    }
}
