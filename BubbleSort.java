public class BubbleSort {
	public static void main(String[] args) {
		//Array with the elements 
		int arr[] = { 85, 42, 23, 18, 25 };
		//1st for loop handle the iteration 
		for (int i = 0; i <= arr.length - 2; i++) {
			//2nd for loop handle the compare the elements in the array 
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				// comparing  arr[j] with arr[j+1] 
				if (arr[j] > arr[j + 1]) {
					//Swaping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//printing using the enhanced for loop
		for (int a : arr) {
			System.out.println(a);
		}

	}
}
