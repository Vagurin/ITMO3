package vag.lesson3;

import java.sql.SQLOutput;

import static vag.lesson3.Study.*;

public class Main {
    public static void main(String[] args) {
        Study study = new Study();
        study.setCourse("Изучение Java – это просто");
        System.out.println(study.printCourse());
        //
        Car audi = new Car();
        Car bmw = new Car("Blue", 133.0);
        audi.setName("audiA6");
        bmw.setName("bmwX5");
        System.out.println(audi);
        System.out.println(bmw);
        //
        Building pushkin = new Building();
        Building kolpino = new Building();
        pushkin.setValues(4, 2015, "Expoforum");
        kolpino.setValues(18, 2012, "NewKolpino");
        System.out.println(pushkin);
        System.out.println(pushkin.yearsSinceBuilt());
        System.out.println(kolpino);
        System.out.println(kolpino.yearsSinceBuilt());
        //
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(21, "Sosna");
        Tree tree3 = new Tree(13, "Bereza");
    }
}
