
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Solution
{	
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
    String s1[]=sc.nextLine().split(" ");
    int a = Integer.parseInt(s1[0]);
    int b = Integer.parseInt(s1[1]);
    String s2 = sc.nextLine();
    String s3 = sc.nextLine();
	HashMap<String, Integer > hm = new HashMap<>();
	HashMap<String, Integer> mag = new HashMap<>();
	hm.put(s2, a);
	mag.put(s3, b);
	if(hm.keySet().contains(mag.keySet()))
	{
	System.out.println("No");
	}
	else
	{
		System.out.println("Yes");
	}
		
	
}
}