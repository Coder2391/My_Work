
public class Operators {

	private int no,no1;
	private String Sname;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}
	
	@Override
	public String toString() {
		return "Operators [no=" + no + ", no1=" + no1 + ", Sname=" + Sname + "]";
	}

	public int getAdd() {
		return no + no1;
	}
	
	public int getSub() {
		return no - no1;
	}
	
	public int getMul() {
		return no * no1;
	}
	
	public int getDiv() {
		return no / no1;
	}

}
