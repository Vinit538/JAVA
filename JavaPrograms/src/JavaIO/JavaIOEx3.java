package JavaIO;
import java.io.*;
public class JavaIOEx3 {
//Java program to transfer data using File Reader,writer and Buffer Reader,writer for more efficiency  
	public static void main(String[] args) throws Exception {
		String path1="D:\\JavaIO\\input1.txt";
		String path2="D:\\JavaIO\\output1.txt";
		FileReader fr=new FileReader(path1);
		FileWriter fw=new FileWriter(path2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String x=null;
		while((x=br.readLine())!=null)
		{
			bw.write(x);
		}
		bw.flush();
	}
}
