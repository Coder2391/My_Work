import java.util.*;

public class SequentialSearch {

	public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 25, 30, 40, 45, 50};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        
        int result = sequentialSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
	}

}
