import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = new int[3];
        for(int i =0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        if(A[0] + A[1] + A[2] != 180 ) {
            System.out.println("Error");
        }
        else if (A[0] == A[1] && A[1] == A[2]) {
            System.out.println("Equilateral");
        } else if(A[0] == A[1] && A[1] !=A[2]) {
            System.out.println("Isosceles");
        } else if(A[0] == A[2] && A[2] !=A[1]) {
            System.out.println("Isosceles");
        } else if (A[1] == A[2] && A[2] !=A[0]) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
