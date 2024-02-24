package Day_3;

public class Palindrome_String {

	public static void main(String[] args) {
       
		String str = "racecarsc";

		PalindromeString(str);
	}

	private static void PalindromeString(String str) {
	     
		int i = 0;
		int j = str.length()-1;
		
		while (i < j ) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println(" Not Palindrome");
				return;
			}
			i++; j--;
		}
		System.out.println("Palindrome ");
		
	}

}
