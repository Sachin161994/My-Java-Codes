package exeriments;

public class UsingStatic {
	static int num;
	static String mystr;
	static {
		System.out.println("This is block1");
	    int num=64;
		String mystr="Sachin";
        		
	}
	static {
		System.out.println("This is block2");
		int num=104;
		String mystr="Mondal";
		
	}
	public static void main(String[] args) {
		System.out.println(num);
		System.out.println(mystr);
		
		
	}

}
