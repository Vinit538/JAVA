package JAVAPrograms;

public class BinarySearch {
	public static void main(String[] args) {
		//Array
		int arr[]= {18,23,25,42,86};
		//Key 
		int key=42;
		// low setting 0	
		int low=0;
		//high setting to the length of the array
		int high=arr.length;
		//using while loop 
		//perform loop until high is became lesser then low or equal
		while(low<=high)
		{
			// getting the mid value
			int mid=(low+high)/2;
			//checking the mid is equal to key or not
			if(key==arr[mid])
			{
				System.out.println("Key Found  "+mid);
				System.exit(0);
			}
			// checking mid is greater than key if increment the low
			else if(key>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			// else decrement the high
			else
			{
				low=low;
				high=mid-1;
			}
		}
		// if key not found in the array print not found
		System.out.println("Key not Found");
	}
}
