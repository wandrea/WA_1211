package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.11..
 */
public class Dog implements IMove, ISleep {

    public void doMove(){
        System.out.println("Dog is running....");
    }
    public void doSleep(){
        System.out.println("Zzzzzzss..");
    }
}
