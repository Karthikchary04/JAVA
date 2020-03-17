package files;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
public class Buffered
{
	public void writer()
    {
    	try
    	{
    		FileWriter fw=new FileWriter("D://java files/bfiles.txt");
    	   BufferedWriter bw=new BufferedWriter(fw);
    	   String str=null;
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("enter string");
    	   str=s.nextLine();
    	   bw.write(str);
    	   bw.newLine();
    	   System.out.println("enter string");
    	   str=s.nextLine();
    	   bw.write(str);
    	   bw.close();
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
    }
	public static void main(String[] args)
	{
        Buffered b=new Buffered();
        b.writer();
	}

}
