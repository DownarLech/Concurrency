public class Consumer implements Runnable{

    Bufor bufor;

    public Consumer(Bufor bufor) {
        this.bufor = bufor;
    }

    @Override
    public void run() {

        for(int i=0;i<10;i++) {
            bufor.download();
        }
    }
}
