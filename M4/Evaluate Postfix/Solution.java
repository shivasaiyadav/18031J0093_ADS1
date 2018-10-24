import java.util.Scanner;
import java.util.Stack;

public class Solution
	{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		Stack<Integer> post=new Stack<Integer>();
		String s1=sc.nextLine();
		String s2[]=s1.split(" ");
		int n=0;
		for(int i=0;i<s2.length;i++)
		{
			try {
				n=Integer.parseInt(s2[i]);
				post.push(n);
				}
			catch(NumberFormatException e) 
				{
				int v1=post.pop();
				int v2=post.pop();
				switch(s2[i].charAt(0))
				{
				case '+':
					n=v1+v2;
					break;
				case '-' :
					n=v2-v1;
					break;
				case '*':
					n=v1*v2;
					break;
				case '/':
					n=v2/v1;
					break;
				}
				post.push(n);
			}
		}
		System.out.println(post.pop());
	}
}

        	