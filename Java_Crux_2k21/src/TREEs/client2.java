package TREEs;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
		Binary_Tree2 bt = new Binary_Tree2();
		bt.createTree();
		bt.display();
		System.out.println("---------------------------------");
		bt.linearize();
		bt.display();
	}

}
