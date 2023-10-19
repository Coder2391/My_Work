package Student_Code;

public class Student {
	private String Name;
	private int age;
	private String Address;
	
	public Student() {
		this.Name = "Unknown";
		this.age = 0;
		this.Address = "Not Available";
	}
	
	public void setInfo(String name, int age) {
        this.Name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.Name = name;
        this.age = age;
        this.Address = address;
    }
    
        
    @Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + ", Address=" + Address + "]";
	}

	
}
