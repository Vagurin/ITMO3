package vag.lesson4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Part1
        // Task_1
        System.out.println("Нечетные Числа с 1 до 99 ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }

        // Task_2

        System.out.println("Делятся на 3");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Делятся на 5");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Делятся на 3 и на 5");
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i);
            }
        }
        // Task_3
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        Integer a = scanner1.nextInt();
        System.out.println("Введите второе число");
        Integer b = scanner1.nextInt();
        System.out.println("Введите третье число");
        Integer c = scanner1.nextInt();
        if (a + b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Task_4
        System.out.println("Введите первое число");
        Integer d = scanner1.nextInt();
        System.out.println("Введите второе число");
        Integer e = scanner1.nextInt();
        System.out.println("Введите третье число");
        Integer f = scanner1.nextInt();
        if (f > e && e > d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Task_5
        Integer[] task5Array = new Integer[]{24, 3, 5, 6, 7, 9, 12, 15, 19, 31};
        System.out.println(Arrays.toString(task5Array));
        if (task5Array[0] == 3 || task5Array[task5Array.length - 1] == 3) {
            System.out.println("Первый или последний элемент массива = 3");
        } else {
            System.out.println("Первый или последний элемент массива не равен 3");
        }
        // Task_6
        Integer[] task6Array = new Integer[]{24, 4, 5, 13, 7, 9, 12, 15, 19, 31};
        System.out.println(Arrays.toString(task6Array));
        boolean isFoundOneThree = false;
        int searchedNumberOne = 1;
        int searchedNumberThree = 3;
        for (int g : task6Array) {
            if (g == searchedNumberOne || g == searchedNumberThree) {
                isFoundOneThree = true;
                break;
            }
        }
        System.out.println("Массив содержит 1 или 3 ? Ответ " + isFoundOneThree);

        // PART_2
        // Task_1

        Integer[] taskArray = new Integer[]{1, 4, 5, 13, 16, 19, 22, 35, 49, 51};
        System.out.println(Arrays.toString(taskArray));
        boolean isSorted = true;
        for (int i = 0; i < taskArray.length - 1; i++) {
            if (taskArray[i] > taskArray[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Массив отсортирован по возрастанию? Ответ " + isSorted);

        // Task_2

        System.out.println("Array length: ");
        int size = scanner1.nextInt();
        int array[] = new int[size];
        System.out.println("Numbers of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner1.nextInt();
        }
        System.out.println("Result:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        // Task_3
        Integer[] taskReplaceArray = new Integer[]{41, 14, 5, 13, 16, 19, 22, 35, 49, 51};
        System.out.println(Arrays.toString(taskReplaceArray));
        Integer firstElement = taskReplaceArray[0];
        taskReplaceArray[0] = taskReplaceArray[taskReplaceArray.length - 1];
        taskReplaceArray[taskReplaceArray.length - 1] = firstElement;
        System.out.println("Первый и последний элемент поменяли");
        System.out.println(Arrays.toString(taskReplaceArray));

        //Task_4

        Integer[] taskUniqueArray = new Integer[]{1, 2, 3, 2, 1, 4, 5, 4, 6, 5};
        System.out.println(Arrays.toString(taskUniqueArray));
        for (int i = 0; i < taskUniqueArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < taskUniqueArray.length; j++) {
                if (Objects.equals(taskUniqueArray[i], taskUniqueArray[j]) && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) System.out.println(taskUniqueArray[i]);
        }
    }
}

