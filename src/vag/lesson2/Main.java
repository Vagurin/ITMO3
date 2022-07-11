package vag.lesson2;
//
//import java.sql.SQLOutput;
//
class Calculator {
    public static int summ(int a, int b) {
        return a + b;
    }
    public static double summ(double A, double B) {
        return A + B;
    }
    public static long summ(long A, long B) {
        return A + B;
    }
    public static double div(int A, int B) {
        return (double) A / B;
    }
    public static double div(double A, double B) {
        return A / B;
    }
    public static double div(long A, long B) {
        return (double) A / B;
    }
    public static int sub(int A, int B) {
        return A - B;
    }
    public static double sub(double A, double B) {
        return A - B;
    }
    public static long sub(long A, long B) {
        return A - B;
    }
    public static int mult(int A, int B) {
        return A * B;
    }
    public static double mult(double A, double B) {
        return A * B;
    }
    public static long mult(long A, long B) {
        return A * B;
    }
}
public class Main {
    public static void main(String[] args) {
//        System.out.println(Calculator.div(4.1, 51342435L));
//        System.out.println(Calculator.sub(42553453L, 5.5));
//        System.out.println(Calculator.mult(43, 5.9));
// Second
        FootballClub Zenit = new FootballClub("Zenit", 1925, "Semak", Color.Blue, true);
        FootballClub Spartak = new FootballClub("Spartak", 1922, "Apaskal", Color.Red, false);
        System.out.println(Zenit);
        System.out.println(Spartak);
//
        Zenit.setest(1933);
        Spartak.setcoach("Karpin");
        Zenit.getest();
        System.out.println(Zenit.getest());
        System.out.println(Spartak);
    }
}