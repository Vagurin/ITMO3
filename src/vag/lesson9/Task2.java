package vag.lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static Set<Cars> deleteDuplicates(List<Cars> carList) {
        return new HashSet<>(carList);
    }

    public static void main(String[] args) {

        List<Cars> carlist = new ArrayList<>();
        carlist.add(new Cars("Volvo"));
        carlist.add(new Cars("Bmw"));
        carlist.add(new Cars("Fiat"));
        carlist.add(new Cars("Nissan"));
        carlist.add(new Cars("Bmw"));
        carlist.add(new Cars("Fiat"));

        System.out.println(carlist);
        System.out.println(deleteDuplicates(carlist));
    }

    static class Cars {
        String name;

        public Cars(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
