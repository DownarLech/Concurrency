public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant(5);
        Thread customer1 = new Thread(new Customer(restaurant));
        Thread customer2 = new Thread(new Customer(restaurant));
        Thread customer3 = new Thread(new Customer(restaurant));
        Thread customer4 = new Thread(new Customer(restaurant));
        Thread customer5 = new Thread(new Customer(restaurant));


        customer1.start();

        customer2.start();

        customer3.start();

        customer4.start();

        customer5.start();

    }
}
