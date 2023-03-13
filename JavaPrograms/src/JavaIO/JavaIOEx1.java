package JavaProgrmas2.coll;

import java.io.*;
//java Program to take input from file and write output to the file
public class JavaIOEx1 {
	public static void main(String[] args) {
	
		try {
				String path1="D:\\JavaIO\\input1.txt";
				String path2="D:\\JavaIO\\output1.txt";
				//FileInputStream and FileOutputStream it can read only one byte of dat a    
				FileInputStream fis=new FileInputStream(path1);
				FileOutputStream fos=new FileOutputStream(path2);
				int x=0;
				while((x= fis.read())!=-1)
					{
						fos.write(x);
					}
					fis.close();
					fos.close();
				
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
