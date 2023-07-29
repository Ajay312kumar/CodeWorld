package String;

//import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class RemoveVowell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // String s = "knowledge";
		removalVowell("ajay");
	}
   public static void removalVowell(String str)
   {
	  // int sum = 0;
	  String s = "";
	  char[] ch= str.toCharArray();
   for(int i = 0; i < ch.length; i++)
   {
	   if(ch[i] == 'A'|| ch[i] =='a' || ch[i] == 'E'|| ch[i] =='e' || ch[i] == 'I' || ch[i] =='i' || ch[i] == 'O'|| ch[i] =='o' || ch[i] == 'U' || ch[i] == 'u') 
       {
       }
      else
      {
    	  s = ch[i]+s;
      }
   }
   System.out.print(s);
	}
}
