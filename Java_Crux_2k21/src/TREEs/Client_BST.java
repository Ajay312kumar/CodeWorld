package TREEs;

public class Client_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in = {10, 20, 30, 40, 50, 60, 70};
		BST bst = new BST(in);
		bst.display();
		
		System.out.println("-----------------");
		System.out.println(bst.find(23));
		
		System.out.println("-----------------");
//		
            bst.max();
            bst.display();
		
	}

}
