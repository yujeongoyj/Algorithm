

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int groupWordCount = 0;


        for (int i = 1; i <= n; i++) {
            String s = scanner.next();
            int length = s.length();
            boolean[] appeared = new boolean[26]; // 알파벳 중 등장여부
            boolean isGroup = true;

            for (int j = 0; j < length; j++) {
                char currentWord = s.charAt(j);
                // 이전 문자와 다른 문자일 경우
                if(j>0 && currentWord != s.charAt(j-1)) {
                    if(appeared[currentWord-'a']) {
                        isGroup = false;
                        break;
                    }
                }
                appeared[currentWord-'a'] = true;
            }
            if (isGroup) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

}
