
import java.util.Scanner;

class Book
{
	String Name,Author;
	double price;

	public Book(String Name,String Author,double price)
	{
		this.Author=Author;
		this.Name=Name;
		this.price=price;
	}

	@Override
	public String toString() {
		return  Name + ", " + Author + ", " + price ;
	}
	
}
class Node
{
	public Book key;
	public int value;
	public Node left,right;
	public String name;
	public Node(Book key,int value)
	{
		this.key=key;
		this.value=value;
	}
}
class Binarysearch
{
	private static Node node;
	static int index =0;
	Node root ;
	public void put(Book key, int value)
	{
		root = put(root,key,value);
	}
	private Node put (Node x, Book key, int value)
	{
		if(x==null)
		{
			return new Node(key,value);
		}
		int c= key.Name.compareTo(x.key.Name);
		if(c<0)
		{
			x.left=put(x.left,key,value);
		}
		else if(c>0)
		{
			x.right=put(x.right,key,value);
		}
		else
		{
			x.value=value;
		}
		return x;
	}
	public int get(Book key)
	{
		Node x =root;
		while(x!=null)
		{
			if(key.Name.compareTo(x.key.Name)<0)
			{
				x=x.left;
			}
			else if(key.Name.compareTo(x.key.Name)>0)
			{
				x=x.right;
			}
			else
			{
				return x.value;
			}
		}
		return 0;
	}
	
	public void min(Node node) 
	{ 
        Node current = node;
        while (current.left != null)
        { 
            current = current.left; 
            
        }
            System.out.println(current.key.Name+", "+current.key.Author+", "+current.key.price); 
    } 
	public void max(Node node)
	{
		Node current = node;
		while(current.right != null)
		{
			current = current.right;
		}
		System.out.println(current.key.Name+", "+current.key.Author+", "+current.key.price);
	}
	
	public Node Floor(Node x,Book key) {
		if(x==null)
			return x;
		int c=key.Name.compareTo(x.key.Name);
		if(c==0)
			return x;
		if(c<0) {
			return Floor(x.left,key);
		}
		Node t=Floor(x.right,key);
		if(t!=null) {
			return t;
		}
			return x;
	}
	public Node Ceiling(Node x,Book key) { 
		if(x==null)
			return x;
		int c=key.Name.compareTo(x.key.Name);
		if(c==0)
			return x;
		if(c>0) {
			return Ceiling(x.right,key);
		}
		Node t=Ceiling(x.left,key);
		if(t!=null) {
			return t;
		}
			return x;
	}
	public void select(int k)
	{
		Select(root, k);
	}
	public void Select(Node node, int k) 
	{
	if(node != null)
	{
		Select(node.left,k);
	if(index == k)
	{
		System.out.println(node.key);
		index++;
		return;
	}
	index++;
	Select(node.right,k);
	}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Binarysearch bst = new Binarysearch();
		while(sc.hasNext())
		{
			String line = sc.nextLine();
			String [] array = line.split(",");
			String Operation = array[0];
			switch (Operation)
			{
			case "put" :
				Book book = new Book(array[1],array[2],Double.parseDouble(array[3]));
				bst.put(book,Integer.parseInt(array[4]));
				break;
			case "get" :
				Book book1 = new Book(array[1],array[2],Double.parseDouble(array[3]));
				if(bst.get(book1)!=0)
					System.out.println(bst.get(book1));
				else
					System.out.println("null");
				break;
			case "min" :
				bst.min(bst.root);
				break;
			case"max":
				bst.max(bst.root);
				break;
			case "floor":
				Book book2 = new Book(array[1],array[2],Double.parseDouble(array[3]));
				System.out.print(bst.Floor(bst.root, book2).key.Name+","+" ");
				System.out.print(bst.Floor(bst.root, book2).key.Author+","+" ");
				System.out.print(bst.Floor(bst.root, book2).key.price);
				System.out.println();
				break;
			case "ceiling":
				Book book3 = new Book(array[1],array[2],Double.parseDouble(array[3]));
				System.out.print(bst.Ceiling(bst.root, book3).key.Name+","+" ");
				System.out.print(bst.Ceiling(bst.root, book3).key.Author+","+" ");
				System.out.print(bst.Ceiling(bst.root, book3).key.price);
				System.out.println();
				break;
			case "select":
				bst.select(Integer.parseInt(array[1]));
				break;
			}
		}
	}

}
