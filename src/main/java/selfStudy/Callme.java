package selfStudy;

public class Callme {
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1100);
        }catch (InterruptedException e){
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
     public void run() {
         synchronized (target) {
             target.call(msg);
         }
     }
}
class Synvh{
    public static void main(String[] args) throws InterruptedException {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "мир");
        Caller ob3  = new Caller(target, "в синхронизированный");

            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

    }
}