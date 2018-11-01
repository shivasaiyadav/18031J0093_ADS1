
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution 
{

	 public static void main(String args[]) 
	{
		 Scanner scn=new Scanner(System.in);
		 ArrayList<Integer> al=new ArrayList<>();
		 int m=scn.nextInt();
		 for(int j=0;j<m;j++) {
			 al.add(scn.nextInt());
			 Collections.sort(al);
			 int i=al.size()-1;
			 double val=(i%2==0)?(double)al.get(i/2):(double)(al.get(i/2)+al.get((i/2)+1))/2;
			 System.out.println(val);
		 }
	 }
	}


