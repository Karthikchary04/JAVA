package files;
import java.io.File;
import java.io.IOException;
public class CreatingFile
{
    public void createFile()
    {
    	try 
    	{
    		File f1=new File("D://java files/file1.txt");
    		if(f1.createNewFile())
    		{
    			System.out.println("File create"+" "+f1.getName());
    		}
    		else
    		{
    			System.out.println("file already exits");
    		}
    	}
    	catch(IOException e)
    	{
    		System.out.println("an error occured");
    		e.printStackTrace();
    	}
    }
	public static void main(String[] args)
	{
       CreatingFile e=new CreatingFile();
       e.createFile();
	}

}
