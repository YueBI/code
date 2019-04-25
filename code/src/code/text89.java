package code;
import java.util.*;
public class text89 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String sss = scan.nextLine();
		for(int i= 0;i<n;i++)
		{
			String string1 = scan.nextLine();
			String[] str1 = string1.split(":");
			
			int second1 = Integer.parseInt(str1[1]);
			int hour1 = Integer.parseInt(str1[0]);
			
			String string2 = scan.nextLine();
			String[] str2 = string2.split(":");
			int second2 = Integer.parseInt(str2[1]);
			int hour2 = Integer.parseInt(str2[0]);
			
			int len = 0;
			int tag = 0;
			if(second2 >= second1)
			{
				len = second2-second1;
			}else
			{
				tag = 1;
				len = second2+60-second1;
			}
			if(tag == 1)
			{
				hour2--;
			}
			if(hour2 >= hour1)
			{
				len += 60 * (hour2-hour1);
			}else
			{
				len +=(24-(hour1-hour2))*60;
			}
			System.out.println(len);	
			
		}

	}

}
