
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        StringBuilder reverseWord = new StringBuilder(word).reverse();

        if(word.equalsIgnoreCase(reverseWord.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}