package HW16_Anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RuntimeTest {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.tsarenko.homework.hw.Homework.HW16.FractionTest");
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method method:declaredMethods) {
                if (method.isAnnotationPresent(MyTest.class)){
                    String name = method.getName();
                    System.out.println(name);
                    try {
                        method.invoke(null);
                        System.out.println("Good");
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                        System.out.println("Something is wrong");
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}