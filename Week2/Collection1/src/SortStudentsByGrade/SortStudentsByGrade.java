package SortStudentsByGrade;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class SortStudentsByGrade {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Ivan", 6));
        studentList.add(new Student("Petar", 5));
        studentList.add(new Student("Georgi", 6));
        studentList.add(new Student("Sasho", 2));
        studentList.add(new Student("Borko", 7));

        sortList(studentList);

    }

    public static void sortList(List<Student> list) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        ValueComparator bvc = new ValueComparator(hm);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);

        for (int i = 0; i < list.size(); i++) {
            hm.put(list.get(i).name, list.get(i).grade);
        }
        sorted_map.putAll(hm);
        System.out.println("The results are: " + sorted_map);
    }
}
