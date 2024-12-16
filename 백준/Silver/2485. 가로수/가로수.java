import java.io.*;
import java.util.Arrays;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];


        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(trees);

        int gcdValue = trees[1] - trees[0];

        for (int i = 2; i < N; i++) {
            gcdValue = gcd(gcdValue, trees[i] - trees[i - 1]);
        }

        
        int result = 0;
        for (int i = 1; i < N; i++) {
            int gap = trees[i] - trees[i - 1]; 
            result += (gap / gcdValue) - 1;         }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
