import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map1 = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            result.append(map1.getOrDefault(num, 0)).append(" ");
        }

        bw.write(result.toString().trim()+ "\n");
        bw.flush();
        bw.close();





    }
}
