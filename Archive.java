
public class Archive {
    
    private String ID, name;
    
    public Archive(String ID, String name){
        this.ID = ID;
        this.name = name;
    }
    
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        
        if(!(other instanceof Archive)){
            return false;
        }
        
        Archive OtherArchive = (Archive) other;
        
        return this.ID.equals(OtherArchive.ID);
    }
    
    public String toString(){
        return this.ID + ": " + this.name;
    }
}
