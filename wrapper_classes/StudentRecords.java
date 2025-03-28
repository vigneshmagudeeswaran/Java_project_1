import java.util.ArrayList;

public class StudentRecords {
    // Storing student grades using ArrayList
    private ArrayList<Integer> studentGrades;

    public StudentRecords() {
        studentGrades = new ArrayList<>();
    }

    // Method to add student grades to the records
    public void addStudentGrade(int grade) {
        studentGrades.add(grade);
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : studentGrades) {
            sum += grade;
        }
        return (double) sum / studentGrades.size();
    }

    public static void main(String[] args) {
        StudentRecords studentRecords = new StudentRecords();
        studentRecords.addStudentGrade(85);
        studentRecords.addStudentGrade(90);
        studentRecords.addStudentGrade(75);

        double averageGrade = studentRecords.calculateAverageGrade();
        System.out.println("Average Grade: " + averageGrade);
    }
}

