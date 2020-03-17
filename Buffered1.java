package files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered1 
{
    public void reader()
    {
    	try
    	{
    	FileReader fr=new FileReader("D://java files/bfiles.txt");
    	BufferedReader br=new BufferedReader(fr);
    	String str=null;
    	while((str=br.readLine())!=null)
    	{
    		System.out.println(str);
    	}
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
    }
	public static void main(String[] args)
	{
        Buffered1 bf=new Buffered1();
        bf.reader();
	}

}
