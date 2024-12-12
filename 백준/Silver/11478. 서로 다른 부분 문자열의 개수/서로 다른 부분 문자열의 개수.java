import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        br.close();

        Set<String> subStrings = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                subStrings.add(S.substring(i, j));
            }
        }


        bw.write(String.valueOf(subStrings.size()));
        bw.flush();
        bw.close();
    }
}
