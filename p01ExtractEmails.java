import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01ExtractEmails {
    public static void main(String[] args) {
        // input
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();

        //proccesing ...
        Pattern pattern = Pattern.compile("([a-zA-Z.-_]+)@([a-zA-Z-]+\\.[a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group(1) + "@" + matcher.group(2));  // split & print user@host
        }
    }
}
