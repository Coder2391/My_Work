//Java exercise program that uses the static keyword to create a class for managing a 
//list of students. The program allows you to add students, display the list of students,
//and count the total number of students using static methods and variables

package Student_Details;

public class Test_Student {

	public static void main(String[] args) {

        Student.addStudent("Ram");
        Student.addStudent("Shyam");

        Student.displayStudents();

        Student.countStudents();
    }
}
