package files;
import java.io.FileReader;
public class BankClassInFiles
{
	public static void main(String[] args)
	{
		int pin=0;
		BankOPerationsINFiles bo=new BankOPerationsINFiles();
		try 
		{
		bo.accountDetails();
		FileReader details=new FileReader("D://java files/Details.txt");
		int i=0;
		while((i=details.read())!=-1)
		{
		pin=details.read();
		}
		details.close();
		}
		catch(Exception e)
		{
			System.out.println("file not fount");
		}
		bo.validate(pin);
	}
}
