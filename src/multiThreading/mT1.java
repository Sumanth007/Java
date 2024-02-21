package multiThreading;

import java.lang.Thread;

class myThread extends Thread{

    @Override
    public void run(){
        for(int i = 0;i < 10;i++)
        {
            System.out.println(this.getName() + " " +i);
        }
    }

}

public class mT1 extends myThread{
    public static void main(String[] args) throws InterruptedException {
        mT1 d1 = new mT1();
        mT1 d2 = new mT1();
        d1.setName("t1");
        d2.setName("t2");
        d1.setPriority(1);
        d1.start();
        d2.start();
        System.out.println("Active coutn " + Thread.activeCount());
        d1.run();



//        System.out.println("Hello");
//        Thread.sleep(10000);
//        for (int i = 100;i < 1000;i++){
//            System.out.println(i);
//        }
    }
}



