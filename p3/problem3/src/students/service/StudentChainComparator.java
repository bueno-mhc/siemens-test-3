package students.service;

import java.util.Comparator;
import java.util.List;
import students.object.Student;

public class StudentChainComparator implements Comparator<Student> {
    // Comparator list for chained comparison
    private List<Comparator<Student>> comparatorList;

    // Constructor
    public StudentChainComparator(List<Comparator<Student>> comparatorList) {
        this.comparatorList = comparatorList;
    }

    // Comparator interface implementations
    @Override
    public int compare(Student student1, Student student2) {
        // Iteratively evaluate the comparison list
        for (Comparator<Student> comparator : comparatorList) {
            int result = comparator.compare(student1, student2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
