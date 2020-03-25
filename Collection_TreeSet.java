package Collections;
import java.util.TreeSet;
public class Collection_TreeSet 
{
    public void set()
    {
    	TreeSet ts=new TreeSet();
    	ts.add(30);
    	ts.add(20);
    	ts.add(50);
    	ts.add(10);
    	ts.add(60);
    	System.out.println("least:"+ts.first());
    	System.out.println("descending order:"+ts.descendingSet());
    	System.out.println(ts.isEmpty());
    	System.out.println("highest:"+ts.last());
    	System.out.println("deleting least element:"+ts.pollFirst());
    	System.out.println("deleting highest element:"+ts.pollLast());
    }
	public static void main(String[] args)
	{
      Collection_TreeSet c=new Collection_TreeSet();
      c.set();
	}
}
