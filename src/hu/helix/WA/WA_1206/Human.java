package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.11..
 */
public class Human implements IMove, ISleep {
   public void doMove(){
       System.out.println("Human running");
   }

   public void doSleep(){
       System.out.println("Zzzzzz...");
   }


}
