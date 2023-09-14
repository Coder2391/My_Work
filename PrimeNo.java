public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int n=100;
		int i;
		
		System.out.println("The Prime Nos are:- ");
		
		for(i=2; i<=n; i++) {
			if(isPrime(i))
			{	
				System.out.print(i + " ");
			}
		}
	}

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        if (num <= 3) {
            return true;
        }
        
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
