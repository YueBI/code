package practice;
import java.util.*;

public class hash {

	public static void main(String[] args) {
	
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(1);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
