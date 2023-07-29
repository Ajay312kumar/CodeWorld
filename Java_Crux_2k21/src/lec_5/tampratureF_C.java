package lec_5;
   import java.util.Scanner;
public class tampratureF_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
      int max = sc.nextInt(); 
      int step = sc.nextInt();
      for(int f = min; f<=max; f+=step)
      {
    	 int c = (int)(5/9f*(f-32));
    	 System.out.println(f+""+c);
      }
	}

}
