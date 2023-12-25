
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
       double sum = 0;
       
       for(int received : this.grades){
           sum += received;
       }
       
       if(this.grades.isEmpty()){
           return -1;
       }
       
       return sum/this.grades.size();
    }
    
    public double averageOfPoints(){
        double sum = 0;
        
        for(int received : this.points){
            sum += received;
        }
        
        if(this.points.isEmpty()){
            return -1;
        }
        
        return sum/this.points.size();
    }
}
