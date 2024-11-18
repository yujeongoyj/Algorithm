

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         각 i번째 대각선의 갯수는 i개
         대각선이 짝수번째 일때는 분모가 1 작아지고, 분자가 1 커진다
         대각선이 홀수번째 일때는 분모가 1 커지고 분자가 1씩 작아진다

         */

        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        // 1부터 X까지 누적된 분수의 개수
        int sum = 0;
        int diagonal = 1;

        // X 가 속한 대각선 번호를 찾기(만약에 4이면 {(1+2+3)-2}이기 때문에 3번째 줄의 첫번째 요소)
        while(sum + diagonal < X) {
            sum += diagonal;
            diagonal++;
        }

        // 대각선 내에서의 위치
        int postInDiag = X - sum;

        if(diagonal % 2 == 1) {

            System.out.println((diagonal - postInDiag + 1) + "/" + postInDiag);
        } else {

            System.out.println(postInDiag + "/" + (diagonal-postInDiag + 1));
        }


    }
}