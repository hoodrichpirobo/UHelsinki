
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        
        if(!(other instanceof Book)){
            return false;
        }
        
        Book OtherBook = (Book) other;
        
        return this.name.equals(OtherBook.name) && this.publicationYear == OtherBook.publicationYear;
    }

}
