
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accessories a1 = new Accessories(10,20);
		
		Accessories a2 = new Accessories();
		
		int result = a1.getAdd();
		System.out.println(result);
		
		int result2 = a2.getAdd();
		System.out.println(result2);
	}

}
