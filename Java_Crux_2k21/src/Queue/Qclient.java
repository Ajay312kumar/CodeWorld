package Queue;

public class Qclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
MyQueue qt = new MyQueue(5);
		
		for(int i = 1; i <= 4; i++)
		{
			qt.enqueue(i);
		}
		qt.display();
		System.out.println(qt.peek());
		System.out.println(qt.dequeue());
		qt.display();
		qt.dequeue();
		qt.display();
		
		qt.enqueue(5);
		qt.enqueue(6);
		
		qt.display();

	}

}
