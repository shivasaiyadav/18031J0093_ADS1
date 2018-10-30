

import java.util.Scanner;

public class Solution
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		String ip = scn.nextLine();
		if (ip.equals("String")) {
			int m = scn.nextInt();
			for (int k = 0; k < m; k++) {
				String st = scn.nextLine();
				String sp[] = st.split(",");
				int n = sp.length;
				boolean flag = true;
				for (int i = 0; i < n / 2 - 1; i++) {
					// System.out.println("true");
					int l = 2 * i + 1; // left = 2*i + 1
					int r = 2 * i + 2; // right = 2*i + 2
					if (l < n && sp[i].compareTo(sp[l]) > 0) {
						flag = false;
						break;
					}
					if (r < n && sp[i].compareTo(sp[r]) > 0) {
						flag = false;
						break;
					}

				}

				System.out.println(flag);
			}
		}
		else if(ip.equals("Double"))
		{
			int m = scn.nextInt();
			for (int k = 0; k < m; k++)
			{
				String st = scn.next();
				String sp[] = st.split(",");
				Double b[]=new Double[sp.length];
				if(b.length==0) {
					System.out.println("false");
				}
				int n = sp.length;
				boolean flag = true;
				for (int i = 0; i < n / 2 - 1; i++) 
				{
					// System.out.println("true");
					int l = 2 * i + 1; // left = 2*i + 1
					int r = 2 * i + 2; // right = 2*i + 2
					if (l < n &&Double.parseDouble((sp[i]))  > Double.parseDouble((sp[l]))) {
						flag = false;
						break;
					}
					if (r < n && Double.parseDouble(sp[i]) >Double.parseDouble(sp[r])) {
						flag = false;
						break;
					}

				}

				System.out.println(flag);
			}
		}
		else if(ip.equals("Integer"))
		{
			int m = scn.nextInt();
			for (int k = 0; k < m; k++)
			{
				String st = scn.next();
				String sp[] = st.split(",");
				Integer b[]=new Integer[sp.length];
				if(b.length==0) 
				{
					System.out.println("false");
				}
				int n = sp.length;
				boolean flag = true;
				for (int i = 0; i < n / 2 - 1; i++) 
				{
					// System.out.println("true");
					int l = 2 * i + 1; // left = 2*i + 1
					int r = 2 * i + 2; // right = 2*i + 2
					if (l < n &&Integer.parseInt((sp[i]))  > Integer.parseInt((sp[l]))) {
						flag = false;
						break;
					}
					if (r < n && Integer.parseInt(sp[i]) > Integer.parseInt(sp[r])) {
						flag = false;
						break;
					}

				}

				System.out.println(flag);
			}
		}
		else if(ip.equals("Float"))
		{
			int m = scn.nextInt();
			for (int k = 0; k < m; k++)
			{
				String st = scn.next();
				String sp[] = st.split(",");
				Float b[]=new Float[sp.length];
				if(b.length==0) 
				{
					System.out.println("false");
				}
				int n = sp.length;
				boolean flag = true;
				for (int i = 0; i < n / 2 - 1; i++) 
				{
					// System.out.println("true");
					int l = 2 * i + 1; // left = 2*i + 1
					int r = 2 * i + 2; // right = 2*i + 2
					if (l < n &&Float.parseFloat((sp[i]))  > Float.parseFloat((sp[l]))) {
						flag = false;
						break;
					}
					if (r < n && Float.parseFloat(sp[i]) > Float.parseFloat(sp[r])) {
						flag = false;
						break;
					}

				}

				System.out.println(flag);
			}
		}
	}
}

