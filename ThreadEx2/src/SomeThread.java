public class SomeThread implements Runnable{

    @Override
    public void run() {
        FirstThing firstThing = new FirstThing();
        SecondThing secondThing = new SecondThing();

        synchronized (firstThing){
            try{
                firstThing.use();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        synchronized (secondThing) {
            try {
                secondThing.use();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}