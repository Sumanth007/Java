package classWork.Assignments;

public class nestedConstrucotr {
    int primaryCon;
    int secondaryCon;

    nestedConstrucotr() {
        this(1);// this has to be the first statement in the constructor like super()
        this.primaryCon = 10;
    }

    nestedConstrucotr(int x) {
        this.secondaryCon = 100;
    }

    public static void main(String[] args) {
        nestedConstrucotr obj = new nestedConstrucotr();
        System.out.println(obj.primaryCon + " " + obj.secondaryCon);

//        Runtime.getRuntime().gc();
    }
}