class implementingRunnable1 implements Runnable{
    implementingRunnable1(){
        Thread thread_One = new Thread(this, "Demo");
        System.out.println(thread_One);
        thread_One.start();
    }
    public void run(){
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Implement Child Thread");
    }
}


public class implementThreadMethod {
    public static void main(String[] args) {
        implementingRunnable1 IR = new implementingRunnable1();
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Main Thread");
    }
}
