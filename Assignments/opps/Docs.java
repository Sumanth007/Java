package classWork.Assignments.opps;

//import java.util.HashMap;

import java.util.Scanner;

class Docs extends Google{
    public boolean login(String name, String passwd){
        Scanner in = new Scanner(System.in);
        if(super.login(name,passwd)){

            return true;
        }
        else{
            System.out.println("You Don't Have A Google Account");
            System.out.println("Do You Want To Create One?  Y/N ");
            String choice = in.next().trim().toLowerCase();
            if(choice.charAt(0) == 'y'){
                super.create(name,passWd);
            }
            else {
                System.out.println("Good Day!");
                return false;
            }
        }
        return true;
    }
}