public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant(10);
        Thread thread1 = new Thread(new Customer(restaurant));
        thread1.start();

        Thread thread2 = new Thread(new Customer(restaurant));
        thread2.start();

        Thread thread3 = new Thread(new Customer(restaurant));
        thread3.start();;
    }
}
