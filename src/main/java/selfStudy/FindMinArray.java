package selfStudy;

public class FindMinArray {
    public static void main(String[] args) {
        int array[] = {5, -1, 6, -2, 6, 25, -8};
        findmin(array);

    }

    public static void findmin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Минимальное значение в массиве " + min);
    }
}

