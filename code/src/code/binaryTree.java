package code;
import java.util.*;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int value)
	{
		val = value;
	}
}
public class binaryTree {
	
	public static void create(TreeNode root,int[]arr,int index)
	{
		if(arr[index] > root.val){
			if(root.right == null)
			{
				root.right = new TreeNode(arr[index]);
				System.out.println(root.val);
			}
			else
				create(root.right,arr,index);
		}
		else{
			if(root.left == null)
			{	root.left = new TreeNode(arr[index]);
			    System.out.println(root.val);}
			else
				create(root.left, arr,index);
		}
}
	public static void preorder(TreeNode root)
	{
		if(root!=null)
		{
			System.out.println(root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		TreeNode root = new TreeNode(arr[0]);
		System.out.println(-1);
		for(int i = 1;i<n;i++)
		{
			create(root,arr,i);
		}
		//preorder(root);
		
		
		

	}

}
