import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        int count = 0;
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) break;
            
            System.out.println("Input the age recommendation: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            books.add(new Book(name,age));
            System.out.println();
        }
        
        System.out.println(books.size() + " books in total." + "\n");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        books.stream()
                .forEach(b -> System.out.println(b));
    }
    
    static class Book{
        String name;
        int age;
        
        public Book(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        public int getAge(){
            return this.age;
        }
        
        public String getName(){
            return this.name;
        }
        
        @Override
        public String toString(){
            return this.getName() + " (recommended for " + this.getAge() + " year-olds or older)";
        }
    }

}
