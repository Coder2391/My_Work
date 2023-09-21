
public class Employee {
	
    private int salary;
    private int Work_hrs;
    
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWork_hrs() {
		return Work_hrs;
	}
	public void setWork_hrs(int work_hrs) {
		Work_hrs = work_hrs;
	}

	
    public void getInfo(int salary, int work_hrs) {
        this.salary = salary;
        this.Work_hrs = work_hrs;
    }

    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (Work_hrs > 6) {
            salary += 5;
        }
    }

    public int calculateFinalSalary() {
        return salary;
    }

}
