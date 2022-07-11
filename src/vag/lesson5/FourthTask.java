package vag.lesson5;

public class FourthTask {
    public static void main(String[] args) {
        String text = "Солнце встало, Солнце село - вот такое дело.Солнце звезда.";
        System.out.println(text);
        String substring = "Солнце";
        String сountText = text;

        Boolean isTheSame = true;
        Integer counter = 0;
        Integer index = -1;
        while (isTheSame) {
            index = сountText.indexOf(substring);
            if (index != -1) {
                counter++;
                сountText = сountText.substring(index + 6);
            } else {
                isTheSame = false;
            }
        }
        System.out.printf("Количество вхождений = " + counter);
    }
}
