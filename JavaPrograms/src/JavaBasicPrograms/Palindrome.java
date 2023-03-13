package JavaBasicPrograms;

public class Palindrome {
	//checking palindrome or not using and also String reverse without using in built
	public static void palindrome1(String s1)
	{
		//Empty String
		String s2 ="";
		//using for loop add last char of the s1 string to empty String 
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println(s1+" : String is palindrome");
		}
		else
		{
			System.out.println(s1+" : String not palindrome");
		}
		
		System.out.println(s1+" : String in the reverse format : "+s2);
	}
	public static void palindrome2(String s1)
	{
		char ch[]=s1.toCharArray();
		String s2="";
		//using for loop add last index char to empty String 
		for(int i=ch.length-1;i>=0;i--)
		{
			s2=s2+ch[i];
		}
		
		if(s1.equals(s2))
		{
			System.out.println(s1+" : String is palindrome");
		}
		else
		{
			System.out.println(s1+" : String not palindrome");
		}
		System.out.println(s1+" : String in the reverse format  : "+s2);


	}
	public static void main(String[] args) {
		String s1="Kodnest";
		palindrome1(s1.toUpperCase());
		palindrome2(s1.toUpperCase());
	}
}
