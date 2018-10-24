
import java.util.Scanner;
public class Solution
{
	    static void common(int arr1[], int arr2[], int m, int n) 
	    { 
	      int i = 0, j = 0; 
	      while (i < m && j < n) 
	      { 
	        if (arr1[i] < arr2[j]) 
	          i++; 
	        else if (arr2[j] < arr1[i]) 
	          j++; 
	        else 
	        { 
	          System.out.print(arr2[j]+" "); 
	          i++; 
	        } 
	      } 
	    } 
	      
	    public static void main(String args[]) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	int m = sc.nextInt();
	    	Scanner s = new Scanner(System.in);
	    	int n = s.nextInt();
	    	System.out.println("enter Array1 elements");
	        int arr1[] = new int[m];
	        for(int i = 0; i<m; i++)
	        {
	        	arr1[i] = sc.nextInt();
	        }
	        System.out.println("enter Array2 elements");
	        int arr2[] = new int[n];
	        for(int j = 0;j<n;j++)
	        {
	        	arr2[j] = sc.nextInt();
	        }
	        common(arr1, arr2, m, n); 
	    } 
	} 

