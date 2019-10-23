import java.util.concurrent.Semaphore;

public class User implements Runnable {

    Table table;
    Semaphore semafor;

    public User(Table table, Semaphore semafor) {
        this.table = table;
        this.semafor = semafor;
    }

    @Override
    public void run() {

        while (true) {
            try {
                semafor.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.use();
            semafor.release();

        }
    }
}