package javamini;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class AddLargeNumbers
	{    
	public static LinkedList<String> numberToDigits(String number)
	 {
		LinkedList<String> ll = new LinkedList<String>();
    	for(int i=0;i<number.length();i++)
    	{
    		ll.add(""+number.charAt(i));
    	}
    	return ll;
	 }  
	 public static String digitsToNumber(LinkedList<String> list) 
	 {
		 String k="";
	    	while(!list.isEmpty())
	    	{
	    		k+=list.peek();
	    		list.remove();
	    		
	    	} 
	    	return k; 
	 }  
	 public static LinkedList<String> addLargeNumbers(LinkedList<String> list1, LinkedList<String> list2)
	 {
		 LinkedList<String> list3 = new LinkedList<String>();
		 Stack<String> st1 = new Stack<String>();
		 Iterator<String> it = list1.iterator();
		 while(it.hasNext())
		 {
			 st1.push(""+it.next());
		 }
		 Stack<String> st2 = new Stack<String>();
		 Iterator<String> it1 = list2.iterator();
		 while(it1.hasNext())
		 {
			 st2.push(""+it1.next());
		 }
		 int c = 0;
	    	while((!st1.isEmpty())&&((!st2.isEmpty())))
	    	{
	    		int val = c+ Integer.parseInt(st1.pop()) + Integer.parseInt(st2.pop());
	    		list3.addFirst(""+val%10);
	    		c = val/10;
	    	}
	    	if((st1.empty()))
	    		st1 = st2;

	    	while(!st1.isEmpty())
	    	{
	    		int val = c+ Integer.parseInt(st1.pop());
	    		list3.addFirst(""+val);
	    		c = val/10;
	    	}
	    	if(c>0)
	    	{
	    		list3.add(""+c);
	    	}
	    	
	    	return list3;
	    
	 }
}
	
public class Solution
	 { 
	 public static void main(String[] args) 
	 {     
	 Scanner sc = new Scanner(System.in);
	 String input = sc.nextLine();     
	 String p = sc.nextLine();     
	 String q = sc.nextLine();       
	 switch(input)
	 {         
	 case "numberToDigits":      
	 LinkedList<String> pDigits = AddLargeNumbers.numberToDigits(p);             
	 LinkedList<String> qDigits = AddLargeNumbers.numberToDigits(q);            
	 System.out.println(AddLargeNumbers.digitsToNumber(pDigits));            
	 System.out.println(AddLargeNumbers.digitsToNumber(qDigits));             
	 break;

	 case "addLargeNumbers":             
	 LinkedList<String> pDigits1 = AddLargeNumbers.numberToDigits(p);              
	 LinkedList<String> qDigits1 = AddLargeNumbers.numberToDigits(q);             
	 LinkedList<String> result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);             
	 System.out.println(AddLargeNumbers.digitsToNumber(result));            
	 break;
	        
	}
	    
	}
	   
	 
	}

