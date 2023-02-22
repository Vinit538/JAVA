package JAVAPrograms;

import java.util.Arrays;

public class Try {

	public static void sort(int arr[])
	{
		quickSort(arr, 0, arr.length-1);
	}
	public static void quickSort(int arr[],int low ,int high)
	{
		if(low<high)
		{
		int j=partition(arr,low,high);
		quickSort(arr,low,j);
		quickSort(arr,j+1,high);
		}
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j)
		{
			while(i<high && arr[i]<=pivot)
			{
				i++;
			}
			while(j>=low && arr[j]>pivot)
			{
				j--;
			}
			if(i<j)
			{
				swap(arr,i,j);
			}
		}
		swap(arr,low,j);
		return j;
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {86,42,23,18,25};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
