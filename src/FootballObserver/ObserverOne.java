/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FootballObserver;

/**
 *
 * @author methanon
 */

public class ObserverOne extends Observer{

   public ObserverOne(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "live result: Thai  " + subject.getState() + " UAE" ); 
   }
}
