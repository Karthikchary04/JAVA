package files;
import java.io.IOException;
import java.io.PrintWriter;
public class print 
{
    print()
    {
    	try
    	{
    		PrintWriter p=new PrintWriter("D://java files/print.txt");
    		p.println("karthik");
    		p.println(100);
    		p.println(99.99f);
    		p.println(100.00);
    		p.println('k');
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
    }
	public static void main(String[] args)
	{
       print p=new print();
	}

}
