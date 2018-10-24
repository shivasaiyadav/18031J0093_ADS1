import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

 class Solution {
	 public static void main(String args[]) throws NumberFormatException, IOException
		{
			int n,c,array[],i,j,k,t=0,c1 = 0,c2=0,c3=0;
			 
		    Scanner sc = new Scanner(System.in);
		    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		    //System.out.println("Enter number of elements");
		    n = Integer.parseInt(br.readLine());
		    array = new int[n];
		    for (c = 0; c < n; c++)
		      array[c] = Integer.parseInt(br.readLine());
		   
		 Arrays.sort(array);
		 for(i=0;i<n;i++)
		 {
		 //System.out.println(array[i]);
		 }
		 
		 for( i=0;i<array.length;i++) 
		 {
			 j=i+1;
			 k=array.length-1;
			 
			 while(j<k)
			 {
				 if(array[i]+array[j]+array[k]==t)
				 {
					// System.out.println("threesum equals target"); 
					 c1++;
					 break;
				 }
				 else if(array[i]+array[j]+array[k]>t)
				 {
					 k--;
					 
				 }
				 else if(array[i]+array[j]+array[k]<t)
				 {
					 j++;
					
				 }
			 }
		 }
		 System.out.println(c1);
}
 }