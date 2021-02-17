package hw12;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatHW12 {
    List<MouseHW12> stomach = new ArrayList<>(5);

    public boolean eat(MouseHW12 a) {
        System.out.println("Кот съел мышь");
        if (stomach.size() < 5) {
            return stomach.add(a);
        } else
            return false;
    }


    void withdrawalFromTheBody() {
        stomach.sort(new Comparator<MouseHW12>() {
            @Override
            public int compare(MouseHW12 o1, MouseHW12 o2) {
                if (o1.getCalories() == o2.getCalories()) return 0;
                else if (o1.getCalories() > o2.getCalories()) return 1;
                else return -1;
            }
        });
        for (int i = 0; i < stomach.toArray().length; i++) {
            System.out.println(stomach.get(i).getCalories());
        }
        stomach.remove(0);
        System.out.println("Процесс вывода прошёл удачно");

    }

    void takeLaxative() {
        List substance = new ArrayList();
        substance.addAll(stomach);
        System.out.println("Кот вывел из организма всех мышей разом");
        stomach.clear();
        for (Object a : substance) {
            if (((MouseHW12) a).calories == 460) {
                System.out.println("Мышь которая нам нужна " + a + " была под индексом "
                        + substance.indexOf(a));
                break;
            }
        }
    }

    @Override
    public String toString() {
        if (stomach.isEmpty() == true) {
            return "Наш кот голоден";
        } else {
            return "Сейчас в животе у нашего кота " + stomach;
        }
    }
}