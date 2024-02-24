package Day_3;

public class TwoMergeSortedArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8,10};
      
		int result[] = MergeArray(arr1,arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] MergeArray(int[] arr1, int[] arr2) {
		
		int i = 0,j=0,k=0;
		
		int res[] = new int[arr1.length+arr2.length];
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				res[k] = arr1[i];
				i++;k++;
				
			} else {
				res[k] = arr2[j];
				k++;j++;

			}
		}
		while (i < arr1.length) {
			res[k] = arr1[i];
			k++;i++;
		}
		while (j < arr2.length) {
			res[k] = arr2[j];
			k++; j++;
		}
		return res;
		
	}

}
