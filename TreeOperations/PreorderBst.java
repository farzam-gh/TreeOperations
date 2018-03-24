import java.util.Scanner;
import java.util.Stack;

public class PreorderBst {

	public static void main(String[] args) {
		PreorderBst pre=new PreorderBst();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of nodes: ");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter nodes: ");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		System.out.println("Can given array represent a preorder? "+
			pre.isPreorder(array,n));
		

	}
	boolean isPreorder(int[] array, int n) {
		Stack<Integer> stack=new Stack<>();
		int root=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(array[i]<root)
				return false;
		while(!stack.isEmpty() && stack.peek()<array[i]) {
			root=stack.peek();
			stack.pop();
		}
		stack.push(array[i]);
		}
		return true;
	}

}
