package oj;
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

// 注释
public class Inorder {
	
	public static List<List<Integer>> find(TreeNode root,List<List<Integer>> List)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			int len = queue.size();
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<len;i++)
			{
				TreeNode node = queue.poll();
				list.add(node.val);
				//System.out.println(node.val);
				if(node.left!=null)
				{
					queue.add(node.left);
				}
				if(node.right!=null)
				{
					queue.add(node.right);
				}	
			}
			List.add(list);	
		}
		return List;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			List<TreeNode> List = new ArrayList<TreeNode>();
			int N = scan.nextInt();
			int M = scan.nextInt();
			for(int j=0;j<M;j++)
			{
				List.add(new TreeNode(j));
			}
			for(int k = 0;k< N;k++) {
				int child = scan.nextInt();
				int father = scan.nextInt();
				TreeNode child1 = List.get(child-1);
				TreeNode father1 = List.get(father-1);
				if(father1.left == null)
				{
					father1.left = child1;
				}else
				{
					father1.right = child1;
				}
			}
			List<List<Integer>> ListInt = new ArrayList<List<Integer>>();
			ListInt = find(List.get(0),ListInt);
			System.out.println("Q"+(i+1)+":");
			for(int j=0;j<ListInt.size();j++)
			{
				List<Integer> list = ListInt.get(j);
				for(int k = 0;k<list.size()-1;k++)
				{
					System.out.print((list.get(k)+1)+" ");
				}
				System.out.println((list.get(list.size()-1)+1));
			}
		}
	}

}
