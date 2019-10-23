import java.lang.Thread;

public class Main {

    public static int[] tab = new int[1000];
    public static int counter = 0;
    public static  int tabCounter = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int a = 0; a < 1000; a++) {
            tab[a] = 1;
        }



        Thread thread = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());
        Thread thread3 = new Thread(new SomeThread());
        Thread thread4 = new Thread(new SomeThread());

        thread.start();
        thread.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();
        System.out.println(tabCounter);
    }

}
