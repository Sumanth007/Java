package classWork.Assignments.opps.inClsAssgnment;

import javax.sound.sampled.Mixer;

public class f1 extends Thread{
    int speed;
    int travel = 0;
    int lapM = 0;
    private static int flag = 0;
    f1(int speed){
        this.speed = speed;
    }
    @Override
    public void run(){
        while(travel <= 100000000)
        {
            travel = travel + speed;
            lapM = lapM + speed;
            if(lapM / 50000000 > 0){
                {
                    this.lap();
                    lapM = 0;
                }
            }

            if(this.travel >= 100000000 && flag == 0){
                flag = 1;
                Thread.yield();
                System.out.println("---------------------------------------------------------");
                System.out.println("||               Winner is : " + this.getName()+"                     ||");
                System.out.println("---------------------------------------------------------");
            }
        }
    }

    public void lap(){
        try {
            System.out.println(this.getName() + " has completed his " + travel / 50000000 + " Lap" + "Speed is " + this.speed);
            this.speed = (int)(Math.random()*10);
            this.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error is " + e);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        int x = 65;
        sleep(1000);
        for(int i = 0;i < 10;i++){
            int speed = (int)(Math.random()*10);
            f1 temp = new f1(speed);
            temp.setName("Name"+((char)x));
            x++;
            temp.start();
        }

    }
}