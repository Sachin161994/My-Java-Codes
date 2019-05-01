package exeriments;

public class Overloading {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(int a,int b) {/*This shows ambiguity when we try to overload
	                                  just by changing the return type of the function*/
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(add(11,11));
	}
}
