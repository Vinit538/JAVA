package JAVAPrograms;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {86,42,23,18,25};
		//declare item, j;
		int item;
		int j;
		//i start with index 1 and go until length of array -1
		for(int i=1;i<=arr.length-1;i++)
		{
			//what ever is there in arr[i] give to item;
			item=arr[i];
			//j is 1 position less than of i
			j=i-1;
			//as long j is positive and j is greater than the item 
			while(j>=0 && arr[j]>item)
			{
				//push the j to 1 position 
				arr[j+1]=arr[j];
				//decrement the j
				j--;
			}
			//what ever in item give to the J+1 
			arr[j+1]=item;
		}
		//Print the array
		for(int a:arr)
		{
			System.out.print(a +" ");
		}
	}
}
