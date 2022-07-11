package vag.lesson5;

class SecondTask {
    public static boolean isPalindrome(String text) {
        char[] charOne = text.toCharArray();
        char[] charTwo = new char[charOne.length];
        String resultString = "";
        for (int i = charOne.length - 1; i >= 0; ) {
            for (int j = 0; j < charTwo.length; j++) {
                charTwo[j] = charOne[i];
                i--;
                resultString += charTwo[j];
            }
        }
        System.out.println(text);
        System.out.println(resultString);
        return text.equalsIgnoreCase(resultString);
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("кОРОНА АНОРОК");
        System.out.println(result);
    }
}


//    public static boolean isPalindrome(String text) {
//        return text.replaceAll("\\W", "")
//                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
//                        .reverse().toString());
//
//    }
//
//    public static void main(String[] args) {
//        boolean result = isPalindrome("ШАЛАШВ");
//        System.out.println(result);
//    }