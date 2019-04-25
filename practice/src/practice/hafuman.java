package practice;
import java.util.*;

public class hafuman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			Queue<Integer> queue = new PriorityQueue<Integer>();
			for(int i=0;i<n;i++)
			{
				queue.add(scan.nextInt());
			}
			int sum = 0;
			while(queue.size()>1)
			{
				int res = queue.poll()+queue.poll();
				queue.add(res);
				sum +=res;
			}
			System.out.println(sum);
		}
		

	}

}
