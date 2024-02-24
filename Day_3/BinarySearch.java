package Day_3;

public class BinarySearch {
   public static void main(String[] args) {
	
	   int arr[]= {1,2,3,4,5,6,7};
	   int target = 5;
	   
	 int result =  BinarySearch(arr,target);
	 
	 System.out.println(result);
}

private static int BinarySearch(int[] arr,int target) {
	
	int i = 0;
	int j = arr.length-1;
	
	while (i <= j) {
		int mid = (i + j)/2; 
		if (arr[mid]==target) {
		return mid;
		} else if(arr[mid] < target){
         i =  mid + 1;
		} else {
		j = mid -1;
		}
	}
	return -1;
}

}
