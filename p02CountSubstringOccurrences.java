import java.util.Scanner;

public class p02CountSubstringOccurrences {
    public static void main(String[] args) {
        // input
        Scanner scr = new Scanner(System.in);
        String inputStr = scr.nextLine();
        String keyWord = scr.nextLine().toLowerCase();

        // computing ...
        int counter = 0;    // count matches
        for (int i = 0; i < inputStr.length() - keyWord.length() + 1; i++) {
            String subString = inputStr.substring(i, i + keyWord.length()).toLowerCase();
            if (subString.equals(keyWord)) {
                counter++;
            }
        }

        // print the results
        System.out.println(counter);
    }
}
