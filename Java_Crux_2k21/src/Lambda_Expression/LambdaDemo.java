package Lambda_Expression;

   @FunctionalInterface
    interface MyLambda
    {
	   public int add(int x,int y);
    }




public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLambda m = (a,b)->a+b;
		int r = m.add(20,30);
		System.out.println(r);
	}

}
