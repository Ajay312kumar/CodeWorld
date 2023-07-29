package lec_3;

//import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Amcat_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 1, n = 4, val = 1, nst = 0;
		while(row <= n)
		{
			int v = 1;
			while(v <= val)
			{ 
				int nt = 1;
				while(nt <= nst)
				{
			
				System.out.print(v+" ");
				System.out.print("*");
				v++;
				nt++;
				}
			
			}
			row++;
			System.out.println();
			nst++;
			val++;
		}
		
	}

}
