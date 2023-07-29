package Lec_6;
 import java.util.Scanner;
public class EvenOddPlacesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = 1, o = 0, r = 0, s = 0, e = 0;
    while(n != 0)
    {
    	r = n % 10;
    	s = s * 10 + r;
    	n = n/ 10;
    }
    while(s != 0)
    {
    	if(c % 2 == 0)
    	{
    		e += s % 10;
    	}
    	else
    	{
    		o += s % 10;
        }
    		s = s / 10;
    		c++;
    	}
    	System.out.println(e);
    	System.out.println(o);
    }
	}


