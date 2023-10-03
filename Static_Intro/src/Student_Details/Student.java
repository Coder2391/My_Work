package Student_Details;

import java.util.*;

public class Student {
	static int cnt;
	
    private static List<String> students = new ArrayList<>();

    public static void addStudent(String name) {
        students.add(name);
        cnt = cnt+1;
    }

    public static void displayStudents() {
        System.out.println("List of Students:" + students);
    }

    public static void countStudents() {
        System.out.println("The count is: "+ cnt);
    }
}
