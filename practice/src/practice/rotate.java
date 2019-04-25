package practice;
import java.util.*;

public class rotate {

	public static void rotate(int[][]arr,int action1)
	{
		for(int i = 0;i<arr.length/2;i++)
		{
			for(int j = i;j<arr.length-1-i;j++)
			{
				if(action1 == 0) //顺时针
				{
					int temp = arr[i][j];
					for(int k = 0;k<3;k++)
					{
						int new_j = i;
						int new_i = arr.length-1-j;
						arr[i][j] = arr[new_i][new_j];
						i= new_i;
						j= new_j;
					}
					arr[i][j] = temp;
				}
				if(action1 == 1) //逆时针
				{
					int temp = arr[i][j];
					for(int k = 0;k<3;k++)
					{
						int new_i = j;
						int new_j = arr.length-1-i;
						arr[i][j] = arr[new_i][new_j];
						i= new_i;
						j= new_j;
					}
					arr[i][j] = temp;
			}
		}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr =new int[5][5]; 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=scan.nextInt();			
			}
		}
		int action1 = scan.nextInt();//顺、逆
		int action2 = scan.nextInt();// 2/3
		int x = scan.nextInt();
		int y = scan.nextInt();
		int[][] res = new int[action2][action2];
		for(int i=0;i<action2;i++)
		{
			for(int j=0;j<action2;j++)
			{
				res[i][j] = arr[x-1+i][y-1+i];
			}
		}
		rotate(res,action1);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");		
			}
			System.out.println(arr[i][4]);
			
		}
	}

}
