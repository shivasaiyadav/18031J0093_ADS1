
import java.util.Hashtable;
import java.util.Scanner;

class Student
{
	String name;
	double marks;
	public Student(String name, double marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer,Student> hst = new Hashtable<Integer,Student>();
		String s1 = sc.nextLine();
		int n = Integer.parseInt(s1);
		int i = 0 ;
		while(i<n)
		{
		String input = sc.nextLine();
		String []d1 = input.split(",");
			Student st = new Student(d1[1],Double.parseDouble(d1[2]));
			hst.put(Integer.parseInt(d1[0]), st);
			i++;
		}
		String s2 = sc.nextLine();
		int m = Integer.parseInt(s2);
		int j = 0 ;
		while(j<m)
		{
			String output = sc.nextLine();
			String []d2=output.split(" ");
			if(!hst.containsKey(Integer.parseInt(d2[1])))
			{
				System.out.println("Student doesn't exists...");
			}
			else if(Integer.parseInt(d2[2])==1)
			{
				Student st1 = hst.get(Integer.parseInt(d2[1]));
				System.out.println(st1.name);
			}
			else if(Integer.parseInt(d2[2])==2)
			{
				Student st1 = hst.get(Integer.parseInt(d2[1]));
				System.out.println(st1.marks);
			}
			i++;
		}
System.out.println(" ");
	}
}
