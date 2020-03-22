package interview_tasks;
import java.util.Scanner;
public class Emi_calcultor 
{
	public static void time(float p,float a,float r)
	{
		int time;
		time=(int)((a*100)/(p*r));
		System.out.println("time is:"+time+"years");
	}
    public void emi(float p,float r,float t)
    {
    	float emi;
    	r=r/(12*100);
    	t=t*12;
    	emi=(float)(p*r*(Math.pow(1+r, t)/((Math.pow(1+r, t)-1))));
    	System.out.println("emi is:"+emi);
    }
	public static void main(String[] args)
	{
        Emi_calcultor e=new Emi_calcultor();
        Scanner s=new Scanner(System.in);
        System.out.println("1.emi \n2.time");
        int opt;
        do
        {
        	System.out.println("enter option");
        	opt=s.nextInt();
        	if(opt==1)
        	{
                System.out.println("enter price");
                float p=s.nextFloat();
                System.out.println("enter intrest");
                float r=s.nextFloat();
                System.out.println("enter time");
                float t=s.nextFloat();
                e.emi(p,r,t);
        	}
        	else if(opt==2)
        	{
        		System.out.println("enter price");
                float p=s.nextFloat();
                System.out.println("enter intrest amount");
                float a=s.nextFloat();
                System.out.println("enter rate of intrest");
                float r=s.nextFloat();
        		time(p,a,r);
        	}
        }
        while(opt!=0);
	}

}
