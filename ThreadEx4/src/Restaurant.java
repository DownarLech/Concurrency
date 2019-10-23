public class Restaurant {

    private int amountTable;

    public Restaurant(int amountTable) {
        this.amountTable = amountTable;
    }

    public int getAmountTable() {
        return amountTable;
    }

    public void useTable(int numerStolkia) {

        System.out.println("Table "+numerStolkia +" is taken");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Table "+numerStolkia+" is free");

    }
}
