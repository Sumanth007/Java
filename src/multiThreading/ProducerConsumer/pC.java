package multiThreading.ProducerConsumer;

import java.nio.Buffer;

public class pC{
    private static int counter = 0;
    private static int BufferSize = 5;
    private static int[] buffer = new int[BufferSize];
    class Prducer extends Thread{
        int i = 0;
        @Override
        public void run(){
            while(true){

                while(counter == BufferSize)    ;
                int a = 10;

            }
        }
    }

    class Consumer extends Thread{
        @Override
        public void run(){
            while(true){

            }
        }
    }

    public static void main(String[] args) {
        pC Producer = new pC();
        pC Consumer = new pC();


    }
}
