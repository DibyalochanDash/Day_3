package Day_3;

public class Longest_PalindromeSubString {
	public static void main(String[] args) {
		
		String str = "missippi";
		
		PalindromicSubstring(str);
	}

	private static void PalindromicSubstring(String str) {
		for (int size = str.length(); size >= 0; size--) {
			for (int i = 0; i <= str.length()-size; i++) {
				String s ="";
				for (int j = i; j < size + i; j++) {
					s = s + str.charAt(j);
				}
					if (IsPalindrome(s)) {
						System.out.print(s);
						return;
					}
				}
			}
			
		}
		
	private static boolean IsPalindrome(String s) {
	    int i= 0;
	    int j = s.length()-1;
	    while (i<=j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
	    } 
	    return true;
	}
	

}
