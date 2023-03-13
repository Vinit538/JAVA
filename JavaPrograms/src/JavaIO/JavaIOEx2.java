package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//java program to transfer using file reader and file writer
public class JavaIOEx2 {
	public static void main(String[] args) {
		String path1="D:\\JavaIO\\input1.txt";
		String path2="D:\\JavaIO\\output1.txt";
		int x=0;
		try {
			FileReader frs=new FileReader(path1);
			FileWriter fws=new FileWriter(path2);
				while((x=frs.read())!=-1)
				{
					fws.write(x);
				}
				frs.close();
				fws.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
}
}
