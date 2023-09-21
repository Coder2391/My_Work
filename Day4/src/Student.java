
public class Student extends Person{
	
	private int enroll;
	private int result;
	
	public int getEnroll() {
		return enroll;
	}
	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [enroll=" + enroll + ", result=" + result + "]";
	}
	
	
	
}
