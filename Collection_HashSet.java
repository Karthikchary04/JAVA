package Collections;
import java.util.HashSet;
public class Collection_HashSet 
{
    public void set()
    {
    	HashSet hs=new HashSet();
    	hs.add("karthik");
    	hs.add("chary");
    	hs.add(100);
    	hs.add(99.99f);
    	hs.add(88.888);
    	System.out.println(hs);
    }
	public static void main(String[] args) 
	{
        Collection_HashSet h=new Collection_HashSet();
        h.set();
	}

}
