package selfStudy;

import java.util.Arrays;

class SumColumns {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Test(array1, array2);

    }

    public static void Test(int[] col1, int[] col2) {
        System.out.println("COL1   " + "COL2    " + "SUM");
        if (col1.length == col2.length) {                        // если размеры массивов одинаковы
            for (int i = 0; i < col1.length; i++) {
                System.out.print(col1[i] + "      " + col2[i] + "       " + (col1[i] + col2[i]));
                System.out.println();
            }
        } else if (col1.length < col2.length) {              // если первый массив меньше второго
            int y = col2.length - col1.length;
            int col1_1[] = Arrays.copyOf(col1, col1.length + y);
            for (int i = 0; i < col2.length; i++) {
                System.out.print(col1_1[i] + "      " + col2[i] + "       " + (col1_1[i] + col2[i]));
                System.out.println();
            }
        } else if (col1.length > col2.length) {            // если первый массив больше второго
            int y = col1.length - col2.length;
            int col2_1[] = Arrays.copyOf(col2, col2.length + y);
            for (int i = 0; i < col1.length; i++) {
                System.out.print(col1[i] + "       " + col2_1[i] + "        " + (col1[i] + col2_1[i]));
                System.out.println();
            }
        }
    }
}

