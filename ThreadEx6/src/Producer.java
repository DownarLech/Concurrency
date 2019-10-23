public class Producer implements Runnable {

    Bufor bufor;

    public Producer(Bufor bufor) {
        this.bufor = bufor;
    }

    @Override
    public void run() {

        for(int i=0;i<10;i++) {
            bufor.add(i);
        }
    }
}
