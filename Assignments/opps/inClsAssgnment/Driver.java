package classWork.Assignments.opps.inClsAssgnment;

public class Driver {
    public static void main(String[] args) {
        Bank obj = new Bank(1,"Neon");
        obj.createFD();
        obj.createSB();
        obj.createRD();
        obj.createFD();

        employee obj1 = new employee("sanami",88771122,200400,"1st june","1st july");
        obj1.getData_of_join();
        obj1.getDate_of_birth();
        obj1.getEname();
        obj1.getSalary();
        obj1.getPhone();


    }
}
