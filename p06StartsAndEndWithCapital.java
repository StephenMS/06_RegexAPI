import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06StartsAndEndWithCapital {
    public static void main(String[] args) {
        // Write a program that takes as input an array of strings are prints
        // only the words that start and end with capital letter. Words are only
        // strings that consist of English alphabet letters. Use regex.

        Scanner scr = new Scanner(System.in);
        String inputStr = scr.nextLine();
        String[] stringArray = inputStr.split(" ");
        for (String s : stringArray) {
            String regex = "\\b[A-Z][a-zA-Z]*[A-Z]\\b";
            //String regex = "([A-Z]\\w*[A-Z])";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            boolean found = matcher.find();
            if (found) {
                System.out.println(matcher.group());
            }
        }


    }
}
