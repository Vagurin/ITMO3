package vag.lesson5;

public class ThirdTask {
    public static String textReplace(String text) {
        // text бяка
        text = text.replace("бяка", "[вырезано цензурой]");
        return text;
    }

    public static void main(String[] args) {
        String result = textReplace("Когда бяка проснулась и погуляла, она пошла смотреть концерт группы бяка");
        System.out.println(result);
    }
}
