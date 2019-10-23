import java.util.Random;

public class Customer implements Runnable {

    public final Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {

        while (true){
            Random random = new Random();
            try {
                Thread.sleep(1000);
                int table = random.nextInt(restaurant.getAmountTables()) + 1;
                System.out.println("A attempt to use the table " + table);

                synchronized (Restaurant.class){


                    restaurant.useTable(table);



                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }
}
