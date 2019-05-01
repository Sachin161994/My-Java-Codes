package exeriments;

public class Excp {
	static void fun() throws IllegalAccessException{
		System.out.println("inside fun().");
		
	}
	public static void main(String[] args) {
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("Caught in main");
		}
	}
}
