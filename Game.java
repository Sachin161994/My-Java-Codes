package exeriments;
import java.util.Random;
class Game extends Thread
{
 public void select(String s)
 {
  int sum=0;
  int card_picked;
  int a;
  Random rnd=new Random();
  int arr[]={101,102,103,104,105,106,107,108,109,110,111,112,113,201,202,203,204,205,206,207,208,209,210,211,212,213,301,302,303,304,305,306,307,308,309,310,311,312,313,401,402,403,404,405,406,407,408,409,410,411,412,413};
  while(sum<25)
  { 
   try{
       Thread.sleep(500);
      }
   catch(InterruptedException e){
       System.out.println(e);
      }
   a=rnd.nextInt(arr.length);
   if(arr[a]!=0){
   card_picked=arr[a];
   arr[a]=0;
   int suit=card_picked/100;
   System.out.print("The card picked by "+s+" is: ");
   switch(suit)
   {
    case 1:
    System.out.println(card_picked%100+" of Spades");
    break;
    
    case 2:
    System.out.println(card_picked%100+" of Diamonds");
    break;

    case 3:
    System.out.println(card_picked%100+" of Clubs");
    break;

    case 4:
    System.out.println(card_picked%100+" of Hearts");
    break;

    default:
    System.out.println(" Not possible ");
   }
   sum+=card_picked%100;}
   if(sum>25){
   System.out.println(s+" wins"); System.exit(0);}
  }
 }
 public void run()
 {
   System.out.println("Thread is running");
   String a=getName();
   int sum=0;
   this.select(a);
   
 }
 public static void main(String[]args)
 {
 Game t1=new Game();
  Game t2=new Game();
  t1.setName("Player 1");
  t2.setName("Player 2");
  t1.start();
  t2.start();
  
 }
}
   