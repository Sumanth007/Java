package classWork.Assignments.opps.coVariant;

public class covariant {
    class Parent {
        Parent method() {
            return new Parent();
        }
    }

    class Child extends Parent {
        @Override
        Parent method() { // Covariant return type
            return new Parent();
        }
    }

}
