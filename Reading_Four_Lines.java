package files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Reading_Four_Lines 
{
	public void ReadingFourLines()
	{
		try
		{
		FileReader fr=new FileReader("D://java files/bfiles.txt");
		BufferedReader bf=new BufferedReader(fr);
		String str=null;
		int count=0;
		while((str=bf.readLine())!=null)
		{
			count++;
			if(count<=4)
				System.out.println(str);
			else
				break;
		}
		}
		catch(IOException e)
		{
			System.out.println("file not found");
		}
	}
	public static void main(String[] args)
	{
        Reading_Four_Lines rf=new Reading_Four_Lines();
	    rf.ReadingFourLines();
	}

}
