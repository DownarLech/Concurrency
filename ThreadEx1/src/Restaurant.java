public class Restaurant {

    int amountTables;

    public int getAmountTables() {
        return amountTables;
    }

    public Restaurant(int amountTables) {
        this.amountTables = amountTables;
    }

    public void useTable(int table) throws InterruptedException {

        System.out.println("table " + table + " is taken");

        Thread.sleep(5000);

        System.out.println("table " + table + " is free");
    }

    public void useTable(){}
}
