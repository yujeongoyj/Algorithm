
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] square = new int[100][100]; // 도화지 크기

        int count = scanner.nextInt(); // 입력받은 사각형의 수

        // 정사각형 수만큼의 각 x, y 위치 입력받기

        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 입력받은 위치 표시
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    square[j][k] = 1; // 해당위치를 1로 표시해 그 위치에 정사각형이 있음을 나타냄
                }
            }
        }
            // 겹친 영역의 넓이를 계산
            int area = 0;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (square[i][j] == 1) {
                        area++;
                    }
                }
            }
            System.out.println(area);


    }

}
