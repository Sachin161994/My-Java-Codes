package exeriments;

public class implement {
	public static void main(String[] args) {
		AbsBank ban=new SBI();
		System.out.println(ban.getrateofinterest());
		ban=new PNB();
		System.out.println(ban.getrateofinterest());
	}

}
