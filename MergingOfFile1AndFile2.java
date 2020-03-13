package files;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class MergingOfFile1AndFile2
{
	MergingOfFile1AndFile2()
	{
		int i=0,j=0;
	try
	{
		FileReader fr=new FileReader("D://java files/file1.txt");
		FileReader fre=new FileReader("D://java files/file2.txt");
		FileWriter f=new FileWriter("D://java files/merge.txt",true);
		while((i=fr.read())!=-1)
		{
			f.write(i);
		}
	
		while((j=fre.read())!=-1)
		{
			f.write(j);
		}
		f.flush();
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args)
	{
		MergingOfFile1AndFile2 mf=new MergingOfFile1AndFile2();
	}

}
