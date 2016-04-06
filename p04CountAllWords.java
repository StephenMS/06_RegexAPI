import java.util.Scanner;

public class p04CountAllWords {
    public static void main(String[] args) {
        // input
        Scanner scr = new Scanner(System.in);
        String inputStr = scr.nextLine();

        String[] stringArray = inputStr.split("[^a-zA-Z]+");

        System.out.println(stringArray.length);
    }
}
