package exeriments;

public interface Try {
	void A();
	void B();
	void C();
}
abstract class B1 implements Try{
	public void C(){System.out.println("I am C");}
}
class M extends B1{
	public void A() {
		System.out.println("I am A");
	}
	public void B() {
		System.out.println("I am B");
			}
}
