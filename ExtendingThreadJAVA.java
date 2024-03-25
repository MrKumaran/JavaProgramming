class ET extends Thread{
    ET(String name){
        super(name);
    }
    public void run(){
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Extents Child Thread");
    }
}
public class ExtendingThreadJAVA {
    public static void main(String[] args) {
        ET e1 = new ET("One");
        ET e2 = new ET("Second");
        e1.start();
        e2.start();
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(e1.isAlive());
                //final Boolean isAlive();
    }
}
