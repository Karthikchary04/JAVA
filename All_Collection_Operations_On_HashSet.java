package Collections;
import java.util.HashSet;
public class All_Collection_Operations_On_HashSet 
{
    public void operations()
    {
    	HashSet set=new HashSet();
    	HashSet set1=new HashSet();
    	
    	set.add("karthik");
    	set.add(99);
    	set.add(99.999);
    	set.add(88.888f);
    	set.add(new Integer(45));
    	set.add("chary");
    	System.out.println("set: "+set);
    	
    	set1.add("krazy");
    	set1.add(77);
    	set1.add(66.999);
    	set1.add(55.888f);
    	set1.add(new Integer(45));
    	set1.add("chary");
    	System.out.println("set1: "+set1);
    	
    	set.addAll(set1);
    	System.out.println("combined set : "+set);
    	
    	set.remove("krazy");
    	System.out.println("set after removing operation:"+set);
    	
    	set.removeAll(set1);
    	System.out.println("set after removing set1:"+set);
    	
    	System.out.println("contains:"+set.contains(99.999));
    	System.out.println("containsAll:"+set.containsAll(set1));
    	System.out.println("equals:"+set.equals(set1));
    	System.out.println("size:"+set.size());
    	System.out.println("clone:"+set.clone());
    	System.out.println("retainAll set:"+set.retainAll(set1));
    	System.out.println("string:"+set.toString());
    	System.out.println("empty:"+set.isEmpty());
    	System.out.println("stream:"+set.stream());
    }
	public static void main(String[] args) 
	{
       All_Collection_Operations_On_HashSet c=new All_Collection_Operations_On_HashSet();
       c.operations();
	}
}
