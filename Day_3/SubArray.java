package Day_3;

public class SubArray {
	public static void main(String[] args) {
		int num [] = {5,1,2,4,9,3,1,3,3};
		int size = 3;
		
		SubArray(num,size);
		
		ReverseArray(num);
		 System.out.println("Reversed array:");
	        for (int i = 0; i < num.length; i++) {
	            System.out.print(num[i] + " ");
	        }
	        
	        SumsubArray(num,size);
	}

	private static void SumsubArray(int[] num, int size) {
		for (int i = 0; i <= num.length-size; i++) {
			int sum = 0;
			for (int j = i; j < i+size; j++) {
				sum = sum + num[j];
				
			}
			System.out.println(sum+" ");
		}
			System.out.println();
		
		
	}

	private static void ReverseArray(int[] num) {
		int i = 0;
		int j = num.length-1;
		
		while (i < j) {
			swap(num,i,j);
			i++;j--;
		}
	}

	private static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		
	}

	private static void SubArray(int[] num, int size) {
		for (int i = 0; i < num.length-size; i++) {
			for (int j = i; j < i + size; j++) {
				System.out.print(num[j]+" ");
			}
			System.out.println();
		}
		
	}

}
