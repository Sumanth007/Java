package multiThreading;

public class formula1 extends Thread{
    int speed = 0;
    int travel = 0;
    private static int flag = 0;
    @Override
    public void run(){
        if(this.getName().equals("Rojor")){
            speed = 1;
        }else if(this.getName().equals("Helex")){
            speed = 10000;
        }
        else if(this.getName().equals("Julia")){
            speed = 200;
        }
        else{
            speed = 1000;
        }
        while(travel <= 2000000000)
        {
            travel = travel + speed;
            if(travel % 1000000000 == 0){
//                    synchronized (this){ we can use this with wait
                    try {
                        System.out.println(this.getName() + " has completed his " + travel / 1000000000 + " Lap" + " speed is :" + this.speed);
//                        this.wait(1000);
                        this.sleep(1000);
                        System.out.println(this.getName() + " -------------has came out from pit stop-------------");
                    } catch (InterruptedException e) {
                        System.out.println("Error is " + e);

                    }
//                }
                }
            if(this.travel >= 2000000000 && flag == 0){
                System.out.println("*********************************************************");
                System.out.println("               Winner is : " + this.getName());
                System.out.println("*********************************************************");
                flag = 1;
            }
            }
        }

    public static void main(String[] args) {
        formula1 d1 = new formula1();
        formula1 d2 = new formula1();
        formula1 d3 = new formula1();
        formula1 d4 = new formula1();
        d1.setName("Rojor");
        d2.setName("Helex");
        d3.setName("Julia");
        d4.setName("Krik");
        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
}
