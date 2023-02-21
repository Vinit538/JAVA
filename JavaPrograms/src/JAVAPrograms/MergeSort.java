package JAVAPrograms;

import java.util.Arrays;

public class MergeSort {
	//sort method
	public static void sort(int arr[])
	{
		//set size of the array to the n
		int n=arr.length;
		// if n is less than 2 return 
		if(n<2)
		{
			return;
		}
		//find the mid
		int mid=n/2;
		//create left array from  initial position to mid
		int left[]=new int[mid];
		// create right array size is  n-mid 
		int right[]=new int[n-mid];
		//give what ever in the arr to left array
		for(int i=0;i<mid;i++)
		{
			left[i]=arr[i];
		}
		//give what ever in the arr to right array
		for(int i=mid;i<n;i++)
		{
			right[i-mid]=arr[i];
		}
		//call sort for left array
		sort(left);
		//call sort for right array
		sort(right);
		//call marge with left,right,arr
		marge(left, right, arr);
	}
	public static void marge(int left[],int right[],int arr[])
	{
		//variable
		int i=0;int j=0;int k=0;
		//aslong as i is less than left array length and  as j is less than right array length
		while(i<left.length&&j<right.length)
		{
			//if i less than j
			if(left[i]<=right[j])
			{
				//increment i and give to k and increment
				arr[k++]=left[i++];
			}
			else
			{
				//increment j and give to k and increment
				arr[k++]=right[j++];
			}
		}
		//As long as i is less than left array size
		while(i<left.length)
		{
			//increment i and give to k and increment
			arr[k++]=left[i++];
		}
		//As long as i is less than right array size

		while(j<right.length)
		{
			//increment j and give to k and increment
			arr[k++]=right[j++];
		}
	}
	public static void main(String[] args) {
		int arr[]= {86,42,23,18,25};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
