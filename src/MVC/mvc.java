package MVC;

public class mvc {
    public static void main(String[] args) {
        Model obj = new Model("Null", "None");
        Controller obj1 = new Controller(obj);
        User obj3 = new User();
        obj3.display(obj.name, obj.srn);

    }

    public static class Model {
        public String name;
        public String srn;

        public Model(String name, String srn) {
            this.name = name;
            this.srn = srn;
        }
    }

    public static class Controller {
        public Controller(Model obj) {
            obj.name = "ABC";
            obj.srn = "PES1PG";
        }
    }

    public static class User {
        public void display(String name, String srn) {
            System.out.println("PES COLLEGE \n" + name + " " + srn );
        }
    }
}
