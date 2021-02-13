package homework11;

public class TestTomJerry {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Джерри", 100);
        Mouse mouse2 = new Mouse("Гарри", 150);
        Mouse mouse3 = new Mouse("Билли", 250);
        Mouse mouse4 = new Mouse("Гамми", 350);
        Mouse mouse5 = new Mouse("Сорри", 460);
        Mouse mouse6 = new Mouse("Молли", 550);
        Mouse mouse7 = new Mouse("Колли", 600);
        Mouse mouse8 = new Mouse("Барри", 400);

        Cat Tom = new Cat();
        System.out.println(Tom);
        Tom.eat(mouse1);
        Tom.eat(mouse2);
        Tom.eat(mouse3);
        Tom.eat(mouse4);
        Tom.eat(mouse5);
        System.out.println();
        Tom.takeLaxative();
        System.out.println(Tom);
        Tom.eat(mouse6);
        Tom.eat(mouse7);
        Tom.eat(mouse7);
        Tom.eat(mouse1);
        Tom.withdrawalFromTheBody();
        System.out.println(Tom);


    }
}
