package OOPS.Static;

public class main {
    public static void main(String[] args) {
        Human obj1 = new Human(10,160,60,"Sumanth");
        Human obj2 = new Human(12,180,80,"Sam");

//        System.out.println(obj1.weight);
//        System.out.println(obj1.name);
//        System.out.println(obj1.age);
//        System.out.println(obj1.population);
//        System.out.println(Human.population);//best practise is to use Human(class_name) over of obj(object_name) while using static things.

        //        greetings();// we can't call this because it is a property of an instance
//        fun(); // this doesn't belong to an instance
        test obj3 = new test("Hey");
        System.out.println(obj3.name);
        System.out.println(obj3);

    }
    static boolean fun(){
        System.out.println("It is fun");
        return true;
    }
    void greetings()
    {
        System.out.println("Hello How Are You");
        fun();
    }
}

class test{
    String name;

    test(String name){
        this.name = "Sumanth";
    }

    @Override()
    public String toString(){
        return name;
    }

}
