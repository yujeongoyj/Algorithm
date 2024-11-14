
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 알파벳 대소문자 구별없이 단어가 주어지면 가장 많이 사용된 단어 출력
        // 단, 가장 많이 사용된 알파벳이 여러개면 '?'출력


        // 단어 입력받기
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        int maxCount = 0;
        char mostFrequentChar = '?';
        boolean duplicate = false; // 중복체크

        // 순회하며 등장하는 알파벳 빈도 계산
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int count = 0;

            if(word.indexOf(c) != i) {
                continue;
            }

            // 등장하면 카운트
            for(int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == c) {
                    count++;
                }
            }


            // 가장 많이 등장한 알파벳
            if(count > maxCount) {
                maxCount = count;
                mostFrequentChar = c;
                duplicate = false;
            } else if(count == maxCount) {
                duplicate = true;
            }
        }

        if(duplicate) {
            System.out.println('?');
        } else {
            System.out.println(Character.toUpperCase(mostFrequentChar));
        }


    }
}
