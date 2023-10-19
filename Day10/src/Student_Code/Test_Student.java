package Student_Code;

public class Test_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] std = new Student[5];

        for (int i = 0; i < std.length; i++) {
            std[i] = new Student();
        }

        std[0].setInfo("Ram", 20);
        std[1].setInfo("Shyam", 22, "Ahmedabad");
        std[2].setInfo("Jay", 19, "Mumbai");
        std[3].setInfo("Rohan", 21);
        std[4].setInfo("Vicky", 18, "Banglore");

        for (Student student : std) {
            System.out.println(student.toString());
        }
	}

}
