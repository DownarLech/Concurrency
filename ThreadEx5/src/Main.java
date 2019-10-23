import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

            Table table = new Table();
            Semaphore semafor = new Semaphore(3);

            Thread thread1 = new Thread(new User(table, semafor ));
            thread1.start();

            Thread thread2 = new Thread(new User(table, semafor ));
            thread2.start();

            Thread thread3 = new Thread(new User(table, semafor ));
            thread3.start();

            Thread thread4 = new Thread(new User(table, semafor ));
            thread4.start();

            Thread thread5 = new Thread(new User(table, semafor ));
            thread5.start();


    }
}
