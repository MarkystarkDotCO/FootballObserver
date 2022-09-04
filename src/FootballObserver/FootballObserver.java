package FootballObserver;

import java.util.Scanner;


public class FootballObserver {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subject subject = new Subject();
        new ObserverOne(subject);
        new ObserverTwo(subject);
      
      
      //System.out.println("First state change: 15");	
      //subject.setState(15);
      //System.out.println("Second state change: 10");	
      //subject.setState(10); 
      while(true){
      System.out.print("Enter Score Thai :");
      String score = sc.nextLine();
      System.out.println(" UAE");
      subject.setState(score);
      
      if(score.equals(""))break;
      
      
      }
    }
}