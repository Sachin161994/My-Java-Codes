package exeriments;

public class Sleep extends Thread{
		 public void run(){
		 for(int i=1;i<10;i++){
		 System.out.println(i);
		 }
		 }
		 public static void main(String args[]){
		 Sleep t1=new Sleep();
		 Sleep t2=new Sleep();
		 Sleep t3=new Sleep();
		 t1.start();
		 try{
			 t1.join();
			 }catch(Exception e){System.out.println(e);}
		 
		 t2.start();
		 t3.start();
		 }
		 }

