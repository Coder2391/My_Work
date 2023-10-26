
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone ph = PhoneFactory.createPhone("Samsung");
		ph.call();
		ph.sms();
		
		ph = PhoneFactory.createPhone("Jio");
		ph.call();
		ph.sms();
	}

}
