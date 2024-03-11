class implementingRunnable implements Runnable{
    implementingRunnable(){
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


class extentingRunnable extends Thread{
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
        System.out.println("Extents Child Thread");
    }
}
public class threadingInJAVA {
    public static void main(String[] args) {
        implementingRunnable IR = new implementingRunnable();
        extentingRunnable ER = new extentingRunnable();
        ER.start();
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
