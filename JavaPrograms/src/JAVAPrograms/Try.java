package JAVAPrograms;

import java.util.Arrays;

public class Try {

	public static void sort(int arr[])
	{
		int n=arr.length;
		if(n<2)
		{
			return;
		}
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=arr[i];
		}
		for(int i=mid;i<n;i++)
		{
			right[i-mid]=arr[i];
		}
		sort(left);
		sort(right);
		marge(left, right, arr);
	}
	public static void marge(int[] left,int[] right,int[] arr)
	{
		int i=0; int k=0; int j=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[i])
			{
				arr[k++]=left[i++];
			}
			else
			{
				arr[k++]=right[j++];
			}
		}
		while(i<left.length)
		{
			arr[k++]=left[i++];
		}
		while(j<right.length)
		{
			arr[k++]=right[j++];
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {86,42,23,18,25};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
