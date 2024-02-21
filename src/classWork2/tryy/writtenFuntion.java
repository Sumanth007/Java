package classWork2.tryy;

public class writtenFuntion {
    public static void main(String[] args) {

        int[] n = {1,2,3,4,5,6,7,8,9,10};

        int temp = 0;
        for(int i = 0; i < n.length;i++)
        {
            int number = (int) (Math.random() * 10);
            System.out.println(number);
            if(number <= n.length){
                for(int j = 0;j < number;j++){
                    System.out.print(n[j]);
                    temp = j;
                }
                System.out.println();
                System.out.println("Pointer location is : " + (temp+1));
                System.out.println();
            }else System.out.println("Pointer location is : 0");

        }
    }

}
