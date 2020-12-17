package students.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import students.object.Student;

public class StudentService {
    // Sorting creiteria for list
    public static List<Student> sortStudents(List<Student> students) {
        // Comparators declarations
        Comparator<Student> sortByGrade = Comparator.comparing(Student::getIntervalGrade).reversed();
        Comparator<Student> sortByName = Comparator.comparing(Student::getNome);
        Comparator<Student> sortByLowerGrades = Comparator.comparing(Student::getValor);
        // Create a list of comparators
        List<Comparator<Student>> comparators = new ArrayList<>();
        comparators.add(sortByGrade);
        comparators.add(sortByName);
        comparators.add(sortByLowerGrades);
        // Sorting by multiple criteria
        Collections.sort(students, new StudentChainComparator(comparators));
        return students;
    }
}
