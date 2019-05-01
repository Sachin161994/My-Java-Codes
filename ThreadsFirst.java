package exeriments;
import java.util.Random;
public class ThreadsFirst extends Thread {
	private String word;
	private int delay;
	public ThreadsFirst(String whatToSay, int delayTime) {
		word= whatToSay;
		delay=delayTime;	
	}
	Random rand=new Random();
	int arr[]= {1,1,1,0,0};
	public void run() {
		try {
			int i;
			
			for(i=0;i<10;i++) {
				int a=rand.nextInt(2000);
				if(a%2==0) {
				System.out.println(a);
				Thread.sleep(delay);
				
				}
			}
		} catch (InterruptedException e) {
			return;
		}
	}
	/*public static void main(String[] args) {
		ThreadsFirst ping= new ThreadsFirst("Sender",33);
		ThreadsFirst pong= new ThreadsFirst("Reciever",100);
		pong.setPriority(Thread.MAX_PRIORITY);
		System.out.println(pong.getPriority());
		new Thread(ping).start();
		new Thread(pong).start();
	}
}*/
