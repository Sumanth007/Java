package classWork.Assignments.opps.google;

import java.util.HashMap;

class Google {
    String userName;
    String passWd;
    static HashMap<String,String> db = new HashMap<>();

    public boolean login(String name, String passWd){
        boolean flagName = false,flagPsw = false;
        String tempName = null ,tempPsw;
        for(String temp : db.keySet()){
            if (name.equals(temp)) {
                flagName = true;
                tempName = temp;
                break;
            }
        }
        if(tempName == null){
            System.out.println("Create an Account");
            return false;
        }
        tempPsw = db.get(tempName);
        if(tempPsw.equals(passWd))flagPsw = true;
        if(flagName && flagPsw) { System.out.println("Login Successful"); return true;}
        else {System.out.println("Login Failed"); return false;}
    }

    public void create(String name, String passWd){
        boolean flagName = false,flagPsw = false;
        String tempName = null ,tempPsw;
        for(String temp : db.keySet()){
            if (name.equals(temp)) {
                System.out.println("User Already Exist Try Different User Name");
            }
        }
        db.put(name,passWd);
        System.out.println("Account Created");
    }
}
