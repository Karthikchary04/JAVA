package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFromFile
{
    public void reading()
    {
    	try
    	{
    		File f2=new File("D://java files/f2.txt");
    		Scanner s=new Scanner(f2);
    		while(s.hasNextLine())
    		{
    			String data=s.nextLine();
    			System.out.println(data);
    		}
    		s.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println("an error occured");
    	}
    }
	public static void main(String[] args) 
	{
       ReadingFromFile rf=new ReadingFromFile();
       rf.reading();
	}

}
