import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3]; 

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            array[0] = Integer.parseInt(st.nextToken()); 
            array[1] = Integer.parseInt(st.nextToken()); 
            array[2] = Integer.parseInt(st.nextToken()); 

           
            if (array[0] == 0 && array[1] == 0 && array[2] == 0) {
                break;
            }

            Arrays.sort(array);

          
            if (array[2] >= array[0] + array[1]) {
                System.out.println("Invalid");
            } else if (array[0] == array[1] && array[1] == array[2]) {
                System.out.println("Equilateral");
            } else if (array[0] == array[1] || array[1] == array[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
