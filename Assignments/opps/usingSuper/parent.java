package classWork.Assignments.opps.usingSuper;

public class parent {
    int p;
    parent(int p){
        this.p = p;
        System.out.println(this.hashCode());
    }

    void display(){
        System.out.println("Hey , Iam Parent");
    }
}
