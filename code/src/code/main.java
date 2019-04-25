package code;
import java.util.*;
import java.util.Arrays;

public class main {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i= 0;i<n;i++)
		{
			int len =scan.nextInt();
			int[] arr = new int[len];
			for(int j= 0;j<len;j++)
			{
				arr[j] = scan.nextInt();
			}
		    Arrays.sort(arr);
		    int max = arr[len-1];
		    System.out.print(max+" ");
		    for(int j=len-2;j>=0;j--)
		    {
		    	if(arr[j]!=max)
		    	{
		    		System.out.println(arr[j]);
		    		break;
		    	}
		    }
			
		}
		
		
	}

}
