package classWork.Assignments1;

public class carClass {
//    static int total_sold;
//    static {
//        total_sold = 0;
//    }
    static int total_sold = 0;
    static double total_sales = 0;
    String name;
    int stock;
    double price;

    public static void main(String[] args) {
        carClass car1 = new carClass("Baleno",5,1000000);
        carClass car2 = new carClass("Ignis",7,2000000);
        carClass car3 = new carClass("Ciaz",8,2500000);

        System.out.println(carClass.total_sales);
        System.out.println(carClass.total_sold);

        car1.sell();
        car2.sell();
        car3.sell();
    }

    carClass(String name , int stock, double price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String sell(){
        if(this.stock > 1)
        {
            carClass.total_sold++;
            tot_sales(price);
            this.stock--;
        }
        return "Remaining no.of "+ this.name + " cars area " + this.stock;
    }

    public String update(double price){
        this.price = price;
        return "Price is update to : " + price;
    }

    public static void tot_sales(double price){
        carClass.total_sales += price;
        System.out.println("Total no.of cars sold : " + carClass.total_sold + "\nTotal amount of money gained : " + carClass.total_sales);
    }
}
