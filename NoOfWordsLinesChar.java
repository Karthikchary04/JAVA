package files;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class NoOfWordsLinesChar 
{
	public void noOfLines()
	{
		int i=0,line=0;
		try
		{
			FileReader f1=new FileReader("D://java files/noOf1.txt");
			while((i=f1.read())!=-1)
			{
				if(i=='\n')
				{
					line++;
				}
			}
			System.out.println("line:"+line);
			f1.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	public void noOfWords()
	{
		int i;
		int wc=1,small=0,big=0;
		try
		{
			FileReader fr=new FileReader("D://java files/noOf1.txt");
			System.out.println("hi");
			
			while((i=fr.read())!=-1)
			{
				if(i==' ')
				{
					wc++;
				}
				else if(i>='a' && i<='z')
				{
					small++;
				}
				else if(i>='A' && i<='Z')
				{
					big++;
				}
			}
			System.out.println("wc:"+wc);
			System.out.println("small:"+small);
			System.out.println("big:"+big);
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
    public void writingIntoFile()
    {
    	String str;
    	try
    	{
    		FileWriter f=new FileWriter("D://java files/noOf1.txt");
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
		NoOfWordsLinesChar no=new NoOfWordsLinesChar();
		int opt;
		System.out.println("1.To write into a file \n2.To display no of words,characters,Special characters");
		System.out.println("3.To display no of lines");
		do
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter option");
		opt=s.nextInt();
		if(opt==1)
		no.writingIntoFile();
		else if(opt==2)
		no.noOfWords();
		else
		{
			no.noOfLines();
		}
		}
		while(opt!=0);
	}

}
