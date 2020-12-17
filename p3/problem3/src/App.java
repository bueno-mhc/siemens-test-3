import java.util.*;

import files.input.InputTable;
import files.output.OutputTable;
import students.object.Student;
import students.service.StudentService;

public class App {
    public static void main(String[] args) throws Exception {
        // Read stundent input file as a CSV format
        List<Student> studentList = InputTable.readCSV("./inputs/grades.csv");
        // Order students
        List<Student> students = StudentService.sortStudents(studentList);
        // Print students ordered
        for (Student student : students) {
            // Create text for print
            String formattedStudent = String.format("%s %d %.0f", student.getNome(), student.getIntervalGrade(),
                    student.getValor());
            // Print to output file
            System.out.println(formattedStudent);
        }
        // Save output
        OutputTable.saveAsText("./ouputs/orderedGrades.txt", students);
    }
}
