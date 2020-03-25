package Collections;
import java.util.HashSet;
public class Adding_Two_HashSets 
{
    public void sets()
    {
    	HashSet set=new HashSet();
    	HashSet set1=new HashSet();
    	set.add("hai");
    	set.add("hello");
    	set.add(10);
    	set.add(20);
    	set.add("niit");
    	
    	set1.add("karthik");
    	set1.add(20);
    	set1.add(10);
    	set1.add(40);
    	set1.add(50);
    	
    	System.out.println("set:"+set);
    	System.out.println("set1:"+set1);
    	set.addAll(set1);
    	System.out.println("combined set:"+set);
    }
	public static void main(String[] args) 
	{
         Adding_Two_HashSets a=new Adding_Two_HashSets();
         a.sets();
	}
}
