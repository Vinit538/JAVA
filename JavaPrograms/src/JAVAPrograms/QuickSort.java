package JAVAPrograms;

import java.util.Arrays;

public class QuickSort {
	
	public static void sort(int[] arr)
	{
		//call quick sort with assign values
		quickSort(arr,0,arr.length-1);
	}
	
	public static void quickSort(int arr[],int low,int high)
	{
		//check the low is lesser than than high or not
		if(low<high)
		{
			// call partition method and it will return pivot
			int j=partition(arr , low, high);
			// call quick sort for the left of the piovt 
			quickSort(arr, low, j);
			// call quick sort for the right of the piovt 
			quickSort(arr, j+1, high);
		}
	}
	
	public static int partition(int arr[],int low,int high)
	{
		// set pivot as to low
		int pivot=arr[low];
		int i=low;
		// j as high
		int j=high;
		//check i is less than j or not than swap
		while(i<j)
		{
			// check the condition if the i less than high and also arr[i] is less than equal to piovt
			  while (i < high && arr[i] <= pivot) {
		            i++;
		        }
			// check the condition if the j greater  than low and also arr[j] is greater than to piovt
		        while (j >= low && arr[j] > pivot) {
		            j--;
		        }
		        //check if i is less than j 
			if(i<j)
			{
				//than swap
				swap(arr,i,j);
			}
		}
		
		swap(arr,low,j);
		// return j
		return j;
	}
	
	public static void swap(int arr[],int i,int j)
	{
		// swap using third variable
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {86,42,23,18,25};
		//Call sort 
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
