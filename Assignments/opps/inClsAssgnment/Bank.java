package classWork.Assignments.opps.inClsAssgnment;


public class Bank {
        int id;
        String name;
        private int SB = 0;
        private int RD = 0;
        private int FD = 0;

        Bank(int id, String name){
            this.id = id;
            this.name = name;
        }

        public boolean createSB(){
            if(this.SB == 0){
                this.SB = 1;
                System.out.println("You have created SB account");
                return true;
            }
            else {
                System.out.println("You already have SB account");
                return false;
            }
        }

        public boolean createFD(){
            if(this.SB == 0)
            {
                System.out.println("You have to have SB account to create FD account");
                return false;
            }
            if(this.FD == 0){
                this.FD = 1;
                System.out.println("You have created FD account");
                return true;
            }
            else System.out.println("You already have FD account");
            return false;
        }

        public boolean createRD(){
            if(this.SB == 0){
                System.out.println("You have to have SB account to create FD account");
                return false;
            }
            if(this.RD == 0){
                this.RD = 1;
                System.out.println("You have created RD account");
                return true;
            }
            else {
                System.out.println("You already have RD account");
                return false;
            }
        }

    public static void main(String[] args) {
        Bank obj = new Bank(1,"z");

        obj.createFD();
        obj.createRD();

        obj.createSB();
        obj.createFD();
        obj.createRD();
    }


}
