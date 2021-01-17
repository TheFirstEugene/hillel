package selfStudy;

public class Array implements Runnable{
    String name;
    Thread t;

    Array(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        t.start();
    }
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name  + "прерван");
        }
        System.out.println(name + " завершен");
    }
}
class MultyThreadDemo{
    public static void main(String[] args) {
        Array ob1 = new Array("Один");
        Array ob2 = new Array("Два");
        Array ob3 = new Array("Три");
        System.out.println("Один поток запущен " + ob1.t.isAlive());
        System.out.println("Два поток запущен "+ ob2.t.isAlive());
        System.out.println("Три поток запущен "+ ob3.t.isAlive());


        try {
          ob1.t.join();
          ob2.t.join();
          ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Один поток запущен " + ob1.t.isAlive());
        System.out.println("Два поток запущен "+ ob2.t.isAlive());
        System.out.println("Три поток запущен "+ ob3.t.isAlive());

        System.out.println("Главный поток завершен");
    }
}

