public class Table {

    public void use() {

        System.out.println("Start "+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End "+Thread.currentThread().getName());
    }
}
