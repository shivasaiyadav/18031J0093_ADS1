
import java.util.Scanner;
import java.util.HashMap;
public class Solution
{
	
public static void main(String args[])
{
	
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	int b= sc.nextInt();
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	HashMap<String, String> hm = new HashMap< String, String>();
	hm.put(s1, s2);
	int i=0;
	if(hm.containsValue(s2))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
}
}
