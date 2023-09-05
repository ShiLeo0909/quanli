package oop2;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String testString = "teststring12345";
        int numberOfVowels = countVowels(testString);
        int numberOfDigits = countDigits(testString);
        System.out.println("Number of vowels is" + numberOfVowels);
        System.out.println("Number of digits is" + numberOfDigits);
        double percentageOfDigits = getPercentageOfDigits(testString);
        double percentageOfVowels = getPercentageOfVowels(testString);
        System.out.printf("number of vowels: %d (%.2f%%)\n", numberOfVowels, percentageOfVowels);
    }

    public static boolean isVowel(char myLowerChar) {
        char[] vowels = {'u', 'e', 'o', 'a', 'i'};
        for (char i : vowels) {
            if ( myLowerChar == i) {
                return true;
            }
        }
        return false;
    }

    public static int countVowels(String myString) {
        String lowerString = myString.toLowerCase();
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (isVowel(lowerString.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String myString) {
        String lowerString = myString.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerString.length(); i++) {
            if (lowerString.charAt(i) >= '0' && lowerString.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }

    public static double getPercentageOfDigits(String myString) {
        int numberOfDigits = countDigits(myString);
        double percentage = 100.0 * numberOfDigits / myString.length();
        return percentage;
    }

    public static double getPercentageOfVowels(String myString) {
        int numberOfVowels = countVowels(myString);
        double percentage = 100.0 * numberOfVowels / myString.length();
        return percentage;
    }
}
