import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = scanner.nextInt();
        scanner.nextLine();


        
        String[] scoresString = scanner.nextLine().split(" ");
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(scoresString[i]);
        }

        double maxScore = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sumNewScore =0;
        for (int i = 0; i < n; i++) {
            double newScore = (scores[i]/maxScore)*100;
            sumNewScore += newScore;
        }

        double newAverage = sumNewScore/n;

        System.out.printf("%.2f", newAverage);


    }
}




