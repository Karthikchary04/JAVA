package files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Reading_Sec_line
{
    public void reading()
    {
    	try
    	{
    	FileReader fr=new FileReader("D://java files/bfiles.txt");
    	BufferedReader br=new BufferedReader(fr);
    	String str=null;
    	int count=0;
    	while((str=br.readLine())!=null)
    	{
    		count++;
    		if(count==2)
    		{
    			System.out.println(str);
    			break;
    		}
    	}
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
    }
	public static void main(String[] args)
	{
         Reading_Sec_line r=new Reading_Sec_line();
         r.reading();
	}

}
