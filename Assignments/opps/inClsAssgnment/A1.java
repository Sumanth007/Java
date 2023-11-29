package classWork.Assignments.opps.inClsAssgnment;

public class A1 {
    class employee{
        String date_of_birth;
        String data_of_join;
        String ename;
        int ephone;
        int salary;

         employee(String ename,int ephone, int salary,String date_of_birth,String data_of_join){
             this.ename = ename;
             this.ephone = ephone;
             this.salary = salary;
             this.date_of_birth = date_of_birth;
             this.data_of_join = data_of_join;
         }
    }

    public void main(String[] args) {
        employee obj = new employee("Sam",141515111,1415151,"1st june","2nd june");
    }

}
