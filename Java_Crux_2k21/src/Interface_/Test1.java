package Interface_;

public interface Test1 {

  abstract	void hello();
	
  default void hi() 
  {
	System.out.println("hiiii");  
  }
  
  static void shi()
  {
	  System.out.println("hii using static");
	  
  }
}
