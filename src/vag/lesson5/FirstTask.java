package vag.lesson5;

public class FirstTask {
      public static String longWord(String text) {
        String[] subString;
        String longWorld = "";

        subString = text.split(" ");
        for (int i = 0; i < subString.length; i++) {
            if (longWorld.length() < subString[i].length()) {
                longWorld = subString[i];
            }
        }
        return longWorld;
    }
    public static void main(String[] args) {
        String longestWord = longWord("Когда ты с утра поднимаешься и идёшь сразу чистить зубы");
        System.out.printf(longestWord);
    }
}

