package classWork.Assignments.opps.usingSuper;

public class child extends parent{
    int age;
    String name;
    int count;

    child(int age , String name,int p,int count){
        super(p);
        this.age = age;
        this.name = name;
        System.out.println(this.hashCode());
    }

     void hello(){
        System.out.println("hey");
    }

    @Override
    void display(){
        System.out.println("Iam child");
    }
}
