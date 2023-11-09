package classWork.Assignments;

public class nestedClass {
    static class ESA{
        int SRN;
        int marks;
        ESA(int SRN , int marks){
            this.SRN = SRN;
            this.marks = marks;
        }
    }

    class ISA{
        int SRN;
        int marks;
        ISA(int SRN , int marks){
            this.SRN = SRN;
            this.marks = marks;
        }
    }

    class Attendance{
        int SRN;
        int attendance;
        Attendance(int SRN , int at){
            this.SRN = SRN;
            this.attendance = at;
        }
    }

    public ISA getISA(){
        ISA obj = new ISA(10,20);
        return obj;
    }

    public static void main(String[] args) {
        nestedClass obj = new nestedClass();
        ESA obj2 = new nestedClass.ESA(10,10);
        nestedClass.ESA obj4 = new ESA(10,10);
        ISA obj3 = obj.getISA();
    }
}
