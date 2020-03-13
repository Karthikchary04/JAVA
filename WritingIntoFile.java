package files;
import java.io.FileWriter;
import java.io.IOException;
public class WritingIntoFile 
{
    public void writingIntoFile()
    {
    	try
    	{
    		FileWriter f2=new FileWriter("D://java files/f2.txt");
            f2.write("hi my name is karthik chary");
            f2.close();
    	}
    	catch(IOException e)
    	{
    		System.out.println("an error occured");
    	}
    }
	public static void main(String[] args) 
	{
       WritingIntoFile e1=new WritingIntoFile();
       e1.writingIntoFile();
	}

}
