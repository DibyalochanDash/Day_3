package Day_3;

public class FindString {

	public static void main(String[] args) {
		
	  String str1 ="here i am stack ranker";
       String str2 ="hackerrank";
       
       String res = FindString(str1,str2);
       System.out.println(res);
	}

	private static String FindString(String str1, String str2) {
		int  i= 0;
		int j = 0;
		
		while (i<str1.length() && j < str2.length() ) {
			if (str1.charAt(i) == str2.charAt(j)) {
				i++;
				j++;
			} else {
              i++;
			}
			
		}
		return j==str2.length()?"yes":"no";
		
	}

}
