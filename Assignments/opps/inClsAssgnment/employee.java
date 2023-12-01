package classWork.Assignments.opps.inClsAssgnment;

public class employee {
    static class emp {
        private String date_of_birth;
        private String data_of_join;
        private String ename;
        private int ephone;
        private int salary;

        emp(String ename, int ephone, int salary, String date_of_birth, String data_of_join) {
            this.ename = ename;
            this.ephone = ephone;
            this.salary = salary;
            this.date_of_birth = date_of_birth;
            this.data_of_join = data_of_join;
        }

        public String getDate_of_birth() {
            System.out.println(this.date_of_birth);
            return this.date_of_birth;
        }

        public String getData_of_join() {
            System.out.println(this.data_of_join);
            return this.data_of_join;
        }

        public String getEname() {
            System.out.println(this.ename);
            return this.ename;
        }

        public int getPhone() {
            System.out.println(this.ephone);
            return this.ephone;
        }

        public int getSalary() {
            System.out.println(this.salary);
            return this.salary;
        }

        public void updateDate_of_birth(String s) {
            this.date_of_birth = s;
        }

        public void updateData_of_join(String s) {
            this.data_of_join = s;
        }

        public void udpateEname(String s) {
            this.ename = s;
        }

        public void updatePhone(int ph) {
            this.ephone = ph;
        }

        public void udpateSalary(int salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        emp ob1 = new emp("s",1,1,"1","1");
        ob1.getEname();
        ob1.getData_of_join();
        ob1.getPhone();
        ob1.getSalary();
    }
}
