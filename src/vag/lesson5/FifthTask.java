package vag.lesson5;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println("Original string: ");
        String originalText = "This is a test string";
        System.out.println(originalText);
        originalText += " ";
        String reverseText = " ";
        Boolean flag = true;
        Integer index = 0;
        Integer indexSymbol;
        while (flag) {
            indexSymbol = originalText.indexOf(" ", index);
            if (indexSymbol != -1) {
                for (int i = indexSymbol; i >= index; i--) {
                    reverseText += originalText.charAt(i);
                }
                reverseText += " ";
                index = indexSymbol + 1;
            } else {
                flag = false;
            }
        }
        System.out.println(" Reverse string: ");
        System.out.println(reverseText);
    }
}

