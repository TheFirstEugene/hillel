package hw13_gen;

import java.util.List;

public class Stat<T extends Number> {
    List<T> test;

    Stat(List<T> a) {
        test = a;
    }

    public void printData() {
        System.out.println(test.toString());
    }

    public double average() {
        double sum = 0.0;
        for (T obj : test) {
            sum += obj.doubleValue();

        }
        return sum / test.size();
    }

    boolean isSameAverage(Stat<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Elements " + test;
    }
}
