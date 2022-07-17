package vag.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Map<User, Integer> map = new HashMap<>();
            map.put(new User("Alex"), 56);
            map.put(new User("Artem"), 77);
            map.put(new User("Oleg"), 42);
            map.put(new User("Ira"), 124);
            map.put(new User("Fedor"), 60);
            map.put(new User("Sveta"), 199);
            System.out.println(checkPoints(map));
        }

        public static Integer checkPoints(Map<User, Integer> map) {
            int a = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя игрока ");
            String s = scanner.nextLine();
            for (Map.Entry<User, Integer> userIntegerEntry : map.entrySet()) {
                if (userIntegerEntry.getKey().getName().equalsIgnoreCase(s)) {
                    return userIntegerEntry.getValue();
                }
            }
            System.out.println("Такого игрока не существует");
            return a;
        }
    }
}