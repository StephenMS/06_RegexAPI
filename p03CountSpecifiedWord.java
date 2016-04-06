import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p03CountSpecifiedWord {
    public static void main(String[] args) {
        // input
        Scanner scr = new Scanner(System.in);
        String inputStr = scr.nextLine();
        String keyWord = scr.nextLine().toLowerCase();

        String[] stringArray = inputStr.split("[ ']+");
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].toString().toLowerCase().equals(keyWord)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
