
public class test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticIntro.SayHello(); // it will print 0 as not yet initialized
		
		StaticIntro st = new StaticIntro();
		System.out.println(st.toString());
		
		StaticIntro st2 = new StaticIntro();
		System.out.println(st2.toString());
		
		StaticIntro st3= new StaticIntro();
		System.out.println(st3.toString());
		
		StaticIntro st4= new StaticIntro();
		System.out.println(st4.toString());
		
		StaticIntro st5= new StaticIntro();
		System.out.println(st5.toString());
		
		
		//instance variable is everytime re-initialized whereas the static variable is 
		// not re-initial and stays the same....
		
		StaticIntro.SayHello();		// it will print 5 as lastly incremented value is 5
		
		//static variable can be called directly by class_name and no need for object for 
		// class_name compulsory....
	}

}
