import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(int i = 1; i <= N; i++) {
            set1.add(br.readLine());
        }
        for(int i = 1; i <= M; i++) {
            set2.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for(String name : set1) {
            if(set2.contains(name)) {
                result.add(name);
            }
        }
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for(String name: result) {
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();

    }
}
