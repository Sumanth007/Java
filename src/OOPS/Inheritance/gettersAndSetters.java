package OOPS.Inheritance;

public class gettersAndSetters {
    String name;

    public static void main(String[] args) {
        gettersAndSetters obj = new gettersAndSetters();

        String get = obj.getName();
        String set = obj.setName("Sumanth");
        System.out.println(get + " " + set);
        System.out.println(obj.getName());


        grandChild obj1 = new grandChild(2,4,5,6,1);
        obj1.hey();

    }

    public gettersAndSetters(){
        this.name = "Null";
        System.out.println(name);
    }

    public String getName(){
        return this.name;
    }
    public String setName(String newName){
        return this.name = newName;
    }

}
