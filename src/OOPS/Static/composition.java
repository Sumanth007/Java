package OOPS.Static;

public class composition {
    Human h1 = new Human(18,20,100,"Sumanth");

    public static void main(String[] args) {
        Human.population = 10;
    }
}
