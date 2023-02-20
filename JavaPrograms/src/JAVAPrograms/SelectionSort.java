package JAVAPrograms;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {86,42,23,18,25};
		//for selection sort required pos,min 
		int min=0;
		int pos=0;
		int temp=0;
		//1st for loop contain the i 
		for(int i=0;i<=arr.length-2;i++)
		{
			//what ever is there in arr[i] give to min
			min=arr[i];
			//what is present in the i give to pos
			pos=i;
			//j th loop ( Second element of the array
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//Compare the min and arr[j]
				if(arr[j]<min)
				{
					// assign the arr[j] to min and pos
					min=arr[j];
					pos=j;
				}
			}
			//Swap the elements
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		for(int a:arr)
		{
			System.out.print(a +" ");
		}
	}
}
