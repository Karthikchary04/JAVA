package interview_tasks;
import java.util.Scanner;
public class NumberToRupees 
{
    public void convertingToRupees(int num)
    {
    	int  thousand=0,hundred=0,ten=0,one=0;
    	String ones[]=new String[] {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
    	String tens[]=new String[] {"tewnty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
    	while(num!=0)
    	{
    		thousand=num/1000;
    		num=num/10;
    		hundred=num/100;
    		num=num/10;
    		 System.out.println(thousand+"thousand");
    		 System.out.println(hundred+"hundred");
    		 System.out.println(ten+"ten");
    		 System.out.println(one+"one");
    	}
    	
    }
	public static void main(String[] args)
	{
        NumberToRupees nw=new NumberToRupees();
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        nw.convertingToRupees(num);
	}

}
