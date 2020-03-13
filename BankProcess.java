package stringPrograms;
import java.util.Scanner;
public class BankProcess 
{
	int a2000=0,b500=0,c100=0;
	public void display()
	{
		System.out.println("2000 notes are:"+a2000);
		System.out.println("500 notes are:"+b500);
		System.out.println("100 notes are:"+c100);
	}
	public void amount(int amt,int acbal)
	{
		int rem=0,decision,temp,wcount=0;
			temp=amt;
		if(amt<=acbal)
		{
			wcount++;
		if(amt%100==0)
		{
			if(amt>=2000)
			{
				a2000=amt/2000;
				amt=amt-(a2000*2000);
			}
			 if(amt>=500)
			{
				b500=amt/500;
				amt=amt-(b500*500);
			}
			 if(amt>=100)
			{
				c100=amt/100;
			}
			amt=temp;
			acbal=acbal-amt;
		}
	}
	}
	public void numberofnotes(int acbal)
	{
		Scanner s=new Scanner(System.in);
		int amt=0,rem=0,decision,temp,wcount=0;
		System.out.println("enter amount");
		amt=s.nextInt();
		temp=amt;
		if(amt<=acbal)
		{
			wcount++;
		if(amt%100==0)
		{
			if(amt>=2000)
			{
				a2000=amt/2000;
				amt=amt-(a2000*2000);
			}
			 if(amt>=500)
			{
				b500=amt/500;
				amt=amt-(b500*500);
			}
			 if(amt>=100)
			{
				c100=amt/100;
			}
			amt=temp;
			acbal=acbal-amt;
		}
		else
		{
			rem=amt%100;
			if(rem<50)
			{
				amt=amt-rem;
				System.out.println(amt);
				System.out.println("enter option 1 or 2");
				decision=s.nextInt();
				if(decision==1)
				{
					amount(amt,acbal);
				}
				else
				{
				   amount(amt,acbal);
				}
			}
			else
			{
				rem=amt%100;
				amt=(amt-rem)+100;
				System.out.println(amt);
				System.out.println("enter option 1 or 2");
				decision=s.nextInt();
					if(decision==1)
				{
					amount(amt,acbal);
				}
				else
				{
					amount(amt,acbal);
				}
			}
		}
	 }
	}
	public void FixedDeposit()
	{
		double intrest=0,acbal=0;
		int amt,years;
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount to deposit");
		amt=s.nextInt();
		System.out.println("amount deposited");
		acbal=amt;
		System.out.println("your account balance is:"+acbal);
		System.out.println("enter years");
		years=s.nextInt();
		if(amt<100000)
		{
		if(years>=0 && years<=2)
		intrest=(amt*4.5*years)/100;
		else if(years>=3 && years<=5)
		intrest=(amt*5*years)/100;
		else if(years>=6 && years<=10)
		intrest=(amt*6*years)/100;
		else if(years>10)
		{
		intrest=(amt*7*years)/100;
	    }
		System.out.println("intrest:"+intrest);
		acbal=acbal+intrest;
		acbal=s.nextDouble();
	    }
	    else if(amt>=100000)
		{
		if(years>=0 && years<=2)
		intrest=(amt*5*years)/100;
		else if(years>=3 && years<=5)
		intrest=(amt*6*years)/100;
		else if(years>=6 && years<=10)
		intrest=(amt*6.5*years)/100;
		else if(years>10)
		{
		intrest=(amt*7.5*years)/100;
	    }
		System.out.println("intrest:"+intrest);
		acbal=acbal+intrest;
		System.out.println(acbal);
	    }
	}
	public void SalaryAccount()
	{
		Scanner s=new Scanner(System.in);
		int amt=0,years=0,acbal=0,intrest=0,opt=0,wcount=0;
		System.out.println("enter amount to deposit");
		amt=s.nextInt();
		System.out.println("amount deposited");
		acbal=amt;
		System.out.println("your account balance is:"+acbal);
		if(opt==1)
		{
			if(wcount<=3) {
			numberofnotes(acbal);
			display();}
			else
			System.out.println("your limit is over for the day");
		}
		else
		{
		System.out.println("enter years to check your account balance after intrest of 2% ");
		years=s.nextInt();
		intrest=(amt*2*years)/100;
		System.out.println("intrest:"+intrest);
		acbal=acbal+intrest;
		acbal=s.nextInt();
	    }
	}

	public void SavingsAccount(int age)
	{
		Scanner s=new Scanner(System.in);
		int amt=0,years=0,acbal=0,intrest=0,opt=0,wcount=0;
		System.out.println("enter amount to deposit");
		amt=s.nextInt();
		System.out.println("amount deposited");
		acbal=amt;
		System.out.println("your account balance is:"+acbal);
		do
		{
		System.out.println("enter option\n 1. withdraw cash\n 2.check intrest ");
		opt=s.nextInt();
		if(opt==1)
		{
			if(wcount<=3) {
			numberofnotes(acbal);
			display();}
			else
			System.out.println("your limit is over for the day");
		}
		else if(opt==2)
		{
		System.out.println("enter years to check your account balance after intrest of 4% ");
		years=s.nextInt();
		if(age<60)
		{
		intrest=(amt*4*years)/100;
		System.out.println(intrest);
		acbal=acbal+intrest;
		System.out.println(acbal);
	    }
	    else
	    {
	    intrest=(amt*5*years)/100;
	    System.out.println(intrest);
		acbal=acbal+intrest;
		System.out.println(acbal);
		}
	    }
	}
		while(opt!=0);
	}
	public void AccountType(int actype,int pin,int acno,int age)
	{
		int eacno,epin;
		if(actype==1)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter pin");
			epin=s.nextInt();
			System.out.println("enter account number");
			eacno=s.nextInt();
			if(epin==pin && acno==eacno)
			SavingsAccount(age);
			else
			System.out.println("incorrect pin");
		}
		else if(actype==2)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter pin");
			epin=s.nextInt();
			System.out.println("enter account number");
			eacno=s.nextInt();
			if(epin==pin && acno==eacno)
			SalaryAccount();
			else
			System.out.println("incorrect pin");
		}
		else if(actype==3)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter pin");
			epin=s.nextInt();
			System.out.println("enter account number");
			eacno=s.nextInt();
			if(epin==pin && acno==eacno)
			FixedDeposit();
			else
			System.out.println("incorrect pin");
		}
	}

	public void details()
	{
		int acno,pin,actype,age;
		Scanner s=new Scanner(System.in);
		System.out.println("OPEN ACCOUNT");
		System.out.println("enter name");
		String name=s.nextLine();
		System.out.println("enter your age");
		age=s.nextInt();
		System.out.println("create account number");
		acno=s.nextInt();
		System.out.println("enter new pin");
		pin=s.nextInt();
		System.out.println("choose account type");
		System.out.println("1.SAVINGS ACCOUNT");
		System.out.println("2.SALARY ACCOUNT");
		System.out.println("3.FIXED ACCOUNT");
		actype=s.nextInt();
		AccountType(actype,pin,acno,age);
	}
	public static void main(String[] args) 
	{
       BankProcess b=new BankProcess();
       b.details();
	}       

}
