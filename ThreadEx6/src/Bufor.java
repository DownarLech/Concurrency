import java.util.concurrent.Semaphore;

public class Bufor {

    int item;

    Semaphore semReady;
    Semaphore semEmpty;


    public Bufor(int item) {
        this.item = item;
        this.semReady =  new Semaphore(0);
        this.semEmpty =  new Semaphore(1);
    }

    public void add(int item) {
        try {
            semEmpty.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.item = item;
        System.out.println("Made: "+item);

        semReady.release();
    }

    public void download() {

        try {
            semReady.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Downloaded: "+item);

        semEmpty.release();
    }
}
