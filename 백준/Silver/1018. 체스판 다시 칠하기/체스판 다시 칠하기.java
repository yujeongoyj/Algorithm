import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        char[][] arr = new char[N][M];


        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                
                minChanges = Math.min(minChanges, getMinChanges(arr, i, j, 'W')); // 첫 번째 칸이 W일 때
                minChanges = Math.min(minChanges, getMinChanges(arr, i, j, 'B')); // 첫 번째 칸이 B일 때
            }
        }
        bw.write(minChanges + "\n");
        bw.flush();
    }

        private static int getMinChanges(char[][] arr, int startRow, int startCol, char color) {
            int changes = 0;
            for (int i = startRow; i < startRow + 8; i++) {
                for (int j = startCol; j < startCol + 8; j++) {
                    if ((i + j) % 2 == 0) {
                        if (arr[i][j] != color) {
                            changes++;
                        }
                    } else {
                        if (arr[i][j] == color) {
                            changes++;
                        }
                    }
                }
            }

            return changes;
        }
}


