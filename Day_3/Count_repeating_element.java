package Day_3;

import java.util.Scanner;

public class Count_repeating_element {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        

	        if (str=="") {
	            System.out.println("0");
	            return;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            int count = 0;

	            for (int j = 0; j < str.length(); j++) {
	                if (ch == str.charAt(j)) {
	                    count++;
	                }
	            }

	            if (i == str.indexOf(ch)) {
	                System.out.println(ch + " appears " + count + " times.");
	            }
	        }
	    }
	}
	







