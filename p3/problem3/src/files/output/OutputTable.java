package files.output;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import students.object.Student;

public class OutputTable {
    public static void saveAsText(String filePath, List<Student> students) throws FileNotFoundException {
        try (PrintWriter outputFile = new PrintWriter(filePath)) {
            for (Student student : students) {
                // Create text for print
                String formattedStudent = String.format("%s %d %.0f", student.getNome(), student.getIntervalGrade(),
                        student.getValor());
                // Print to output file
                outputFile.println(formattedStudent);
            }
        }
    }
}
