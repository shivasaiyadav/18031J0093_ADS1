
import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;
class Deque1
	{
	LinkedList<Integer> ll = new LinkedList<Integer>();
	public void pushRight(int N) 
	{
		ll.add(N);
	}
	public void popLeft() 
	{
		ll.removeFirst();
	}
	public void pushLeft(int N) 
	{
		ll.addFirst(N);
	}
	public void popRight() 
	{
		ll.removeLast();
	}
	public String print()
	{
		if (ll.isEmpty()) 
		{
			return "[]";
		}
		String st = "[" + ll.get(0);
		for (int i = 1; i < ll.size(); i++) {
			st = st + ", " + ll.get(i);
		}
		st = st + "]";
		return st;
	}
}
public class Deque
{
	public static void main(String[] args)
	{
		int n, i, data;
		String s;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		Deque1 d = new Deque1();
		while (scan.hasNext())
		{
			s = scan.nextLine();
			String[] s1 = s.split(" ");
			switch (s1[0])
			{
			case "isEmpty":
				System.out.println(d.ll.isEmpty());
				break;
			case "size":
				System.out.println(d.ll.size());
				break;
			case "pushLeft":
				data = Integer.parseInt(s1[1]);
				d.pushLeft(data);
				System.out.println(d.ll);
				break;
			case "pushRight":
				data = Integer.parseInt(s1[1]);
				d.pushRight(data);
				System.out.println(d.ll);
				break;
			case "popLeft":
				d.popLeft();
				System.out.println(d.print());
				break;
			case "popRight":
				d.popRight();
				System.out.println(d.print());
				break;
			}
		}	
	}
}




