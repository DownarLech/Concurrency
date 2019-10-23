import java.time.Duration;
import java.util.Random;

public class Customer implements Runnable{

    Restaurant restaurant;
    Random random = new Random();

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {

        while (true) {

            try {
                //Thread.sleep(random.nextInt(3000));
                Thread.sleep(Duration.ofSeconds(random.nextInt(5)).toMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Integer amountTable = random.nextInt(restaurant.getAmountTable())+1;

            System.out.println("A attempt to use a table "+amountTable.intValue());

            synchronized (amountTable) {
                restaurant.useTable(amountTable.intValue());

            }


        }

    }
}
