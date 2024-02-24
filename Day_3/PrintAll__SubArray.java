package Day_3;

import java.util.Scanner;

public class PrintAll__SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printAllsubArray(arr);

	}

	private static void printAllsubArray(int[] arr) {
		for (int size = 1; size <= arr.length; size++) {
			
		for (int i = arr.length; i >1; i--) {
			for (int j = i; j < i+size; j++) {
				System.out.print(arr[j]+" ");
				
			}
			System.out.println();
			
		}
		}
		
	}

}
