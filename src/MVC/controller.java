package MVC;

public class controller {
    public static void main(String[] args) {
        mvc.Model obj = new mvc.Model("Null", "None");
        mvc.Controller obj1 = new mvc.Controller(obj);
        mvc.User obj3 = new mvc.User();
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
        public Controller(mvc.Model obj) {
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
