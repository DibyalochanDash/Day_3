package Day_3;

public class String_starPrint {

	public static void main(String[] args) {
		String str = "banana";
		
		Starprint(str);

	}

	private static void Starprint(String str) {
	     String t = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a') {
				t  += "*" + str.charAt(i);  
			}else {
				t += str.charAt(i);
			}
		
		}
	System.out.println(t);	
		
		
	}

}
