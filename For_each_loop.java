
public class For_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[5];
		
		arr[0] = 30;
		arr[1] = 50;
		arr[2] = 25;
		arr[3] = 70;
		arr[4] = 10;
		
		int m = arr[0];
		for(int k: arr) {
			System.out.println(k + " ");
				
			if(k > m) {
				m = k;	
			}
		}
			System.out.println("The Highest num:" + m);
			
		
	}

}
