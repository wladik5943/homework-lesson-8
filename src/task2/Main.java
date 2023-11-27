package task2;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple("красный");



        System.out.println(apple.getColor());

        Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple,(String)"зеленый");

        System.out.println(apple.getColor());

    }

}
