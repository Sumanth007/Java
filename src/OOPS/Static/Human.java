package OOPS.Static;

public class Human {
    public static void main(String[] args) {
//        main obj = new main();
        main.fun();
//        obj.greetings();
    }
    int age;
    int height;
    int weight;
    String name;
    static long population;

    static void gtee()
    {
        System.out.println("Hello World");
    }

    Human(int age,int height,int weight,String name){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.population += 1;

    }
}
