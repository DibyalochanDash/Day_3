package Day_3;

public class Array_Palindrome {
     public static void main(String[] args) {
		
    	 int arr[] = {1,2,3,2,1};
    	 
    	 boolean yes = ArrayPalindrome(arr);
    	 if (yes) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
    	 
    	 CheckPalindrome(arr);
	}

	private static void CheckPalindrome(int[] arr) {  //1st way solve
		int i = 0;
		int j = arr.length-1;
		while (i < j) {
			if (arr[i] != arr[j]) {
				System.out.println("Not Palindrome");
				return;
			}
			i++;j--;
		}
		System.out.println("Palindrome");
		
	}

	private static boolean ArrayPalindrome(int[] arr) { //2nd Way Solve
		 
		int i = 0;
		while (i < arr.length /2) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				return false;
			}
			i++;
		}
		return true;
		
	}
}
