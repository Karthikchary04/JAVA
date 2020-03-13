package interview_tasks;
import java.util.Scanner;
public class NumberToWords
{
    public void convertingToWords(int num)
    {
    	int rem=0;
    	String numbers[]=new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	while(num!=0)
    	{
    		rem=num%10;
    		System.out.println(numbers[rem]);
    		num=num/10;
    	}
    }
	public static void main(String[] args) 
	{
        NumberToWords nt= new NumberToWords();
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        nt.convertingToWords(num);
	}

}
