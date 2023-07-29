package Abstarct_OOPs;

public class Scooter  extends vehicle{
	
	void start()
	{
		System.out.println("start with kick");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.start();
		Scooter sc = new Scooter();
		sc.start();
	}

}
