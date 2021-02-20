package hw12;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatHW12 {
    List<MouseHW12> stomach = new ArrayList<>(5);

    public boolean eat(MouseHW12 a) {
        if (stomach.size() < 5) {
            stomach.add(a);
            stomach.sort(new Comparator<MouseHW12>() {
                @Override
                public int compare(MouseHW12 o1, MouseHW12 o2) {
                    if (o1.getCalories() == o2.getCalories()) return 0;
                    else if (o1.getCalories() > o2.getCalories()) return 1;
                    else return -1;
                }
            });
            for (int i = 0; i < stomach.toArray().length; i++) {
                stomach.get(i).getCalories();
            }
            return true;

        } else
            return false;
    }


    public boolean withdrawalFromTheBody() {
        stomach.remove(0);
        return true;

    }

    public List<MouseHW12> takeLaxative() {
        List substance = new ArrayList();
        substance.addAll(stomach);
        stomach.clear();
        for (Object a : substance) {
            if (((MouseHW12) a).calories == 460) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        return substance;
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

