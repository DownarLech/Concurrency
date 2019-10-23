public class Main {

    public static void main(String[] args) {

        Bufor bufor = new Bufor(1);

        Thread thread1 = new Thread(new Producer(bufor));
        thread1.start();

        Thread thread2 = new Thread(new Consumer(bufor));
        thread2.start();

    }
}
