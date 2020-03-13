package files;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class file2 
{
    file2()
    {
    	String str;
    	try
    	{
    		FileWriter f=new FileWriter("D://java files/file2.txt");
    		Scanner s=new Scanner(System.in);
    		System.out.println("enter data to insert into file");
    		str=s.nextLine();
    		f.write(str);
    		f.flush();
    		f.close();
    	}
    	catch(IOException e)
    	{
    		System.out.println("an error occured");
    	}
    }
	public static void main(String[] args)
	{
       file2 f=new file2();
	}

}
