package exeriments;
import java.util.*;

public class StopNWait extends Thread {
	
	

	public void run(){
		try {
			int i;
			for(i=0;i<10;i++) {
				Thread.sleep(1000);
				int arr[]= {1,1,1,1,0};
				System.out.println(arr[i]);
			}
		}
			
	}

	}
public class Example{
	public static void main(String[] args) {
		
	}
}
	

