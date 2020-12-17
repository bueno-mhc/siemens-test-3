package files.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import students.object.Student;

public class InputTable {
    public static List<Student> readCSV(String filePath) throws IOException {
        List<Student> records = new ArrayList<>();
        // Try reading CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip table header line
            br.readLine();
            // Iterate over CSV and create student objects
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(new Student(values[0], values[1], values[2]));
            }
        } catch (FileNotFoundException ex) {
            System.out.printf("File no found in path '%s'.%n", filePath);
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return records;
    }
}
