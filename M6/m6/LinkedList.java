package exam;

class Node1 
{
	int data;
	Node1 next;
	  public Node1(int a)
	 {
		 data=a;
		 next=null;
	 }
	public String toString() {
		if(next==null)
		{
			return data+"";
		}
		else
		{
		return data+""+next;
		}
	}  

}
 class 	LinkedList
 {
	 Node1 head;
	
	
 	
 
 	public void pushend(int a)
 	{
 		Node1 n=new Node1(a);
 	
 		if(head==null)
 		{
 			head=n;
 		}
 		else
 		{	Node1 temp =head;
 		while(temp.next!=null)
 		{
 			temp=temp.next;
 		}
 		
 		temp.next=n;
 		}
 		
 	}
 	public int  popend()
	{
 		Node1 temp1=null;
		
		if(head==null)
			
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else if(head.next==null)
		{Node1 temp=head;
		head=null;
			return temp.data;
		}
		else
		{
			Node1 temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp1=temp.next;
		temp.next=null;
		return temp1.data;
		}
		

	}
	
	public void disply()
	{	
		Node1 temp=head;
		if(head==null)
		{
			System.out.println("there are no elements to display");
		}
		else
		{
		while(temp!=null)
		{
			
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		}
	}
	public void pushf(int a)
	{

 		Node1 n=new Node1(a);
 	
 		if(head==null)
 		{
 			head=n;
 		}
 		else
 		{	n.next=head;
 		    head=n;
 		}
 		
	}
	public int popf()
	{
 	
 		if(head==null)
 		{
 			return -1;
 		}
 		else
 		{	Node1 temp1=head;
 		head=head.next;
 		   return temp1.data;
 		}
 		
	}
	public int size()
	{Node1 temp1=head;
	int count=0;
	while(temp1!=null)
	{
		temp1=temp1.next;
		count++;
		
	}
	return count;
		
	}
	public String toString() {
		if(head.next==null)
		{
			return head.data+"";
		}
		else
		{
		return head.toString();
		}
	}
	
 }



