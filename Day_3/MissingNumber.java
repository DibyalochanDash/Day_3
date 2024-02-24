package Day_3;

public class MissingNumber {
	public static void main(String[] args) {
		
		int []arr= {1,2,3,5,6,7,8,9};
		
		int res = MissingElement(arr);
		System.out.println(res);
	}

	private static int MissingElement(int[] arr) {
		
		int n = arr.length+1;
		
		int sum = n*(n + 1)/2;
		
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		
			return sum - total;
	}
	

}
