
public class StaticIntro {
	private int no =0;
	static int cnt=0 ;
	
	public StaticIntro() {
		no = no+1;
		cnt = cnt+1;
		
	}

	@Override
	public String toString() {
		return "StaticIntro [no=" + no + " Count " + cnt + "]";
	}
	
	public static void SayHello() {		// static function
		
//		System.out.println(no);    no is not static so static function will not allow
		
		System.out.println(cnt);		// only static data member allowed.
	}
	
	// normal function can access both static and non-static data members.
}
