
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  

        // 크로아티아 알파벳 특수문자 배열
        String[] croatiaLetters = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

   
        for (String letter : croatiaLetters) {
            input = input.replace(letter, "*");  
        }

        int result = input.length();
        System.out.println(result);
    }
}

