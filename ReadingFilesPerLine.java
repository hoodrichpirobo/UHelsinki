import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

    }

    public static List<String> read(String file){
        List<String> lines = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(file)).forEach(line -> lines.add(line));
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return lines;
    }
}
