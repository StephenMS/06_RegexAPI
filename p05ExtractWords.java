import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05ExtractWords {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputStr = scr.nextLine();

        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputStr);

        while(matcher.find()){
            System.out.printf("%s ", matcher.group());
        }
    }
}
