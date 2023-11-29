package classWork.Assignments.opps.inClsAssgnment;

public class Bank {
        int id;
        int name;
        private int SB = 0;
        public String SB(){
        return "You have create SB";
        }

        public String FD(){
            if(this.SB == 0)    return "You have to have SB account to create FD account";
            return null;
        }

        public String RD(){
            if(this.SB == 0)    return "You have to have SB account to create RD account";

            return null;
        }

    public static void main(String[] args) {

    }

}
