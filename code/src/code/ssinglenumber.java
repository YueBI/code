package code;
import java.util.*;

public class ssinglenumber {

	public static int SingleNumber(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i-1<0 && arr[i]!=arr[i+1])
            {
                return arr[i];
            }else if(i+1>arr.length-1 && arr[i]!=arr[i-1])
            {
                return arr[i];
            }else if(i-1>=0 && i+1<=arr.length-1)
            {
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                    return arr[i];
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int[] arr = new int[n];
			//String sss = scan.nextLine();
			for(int i=0;i<n;i++)
			{
				arr[i] = scan.nextInt();
			}
			int res = SingleNumber(arr);
			System.out.println(res);
		}

	}

}
