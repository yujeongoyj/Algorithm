import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     

        double totalCredits = 0; // 총학점
        double weightedSum = 0; // 가중합

        for (int i = 0; i < 20; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(" ");


            double credits = Double.parseDouble(data[1]); // 학점
            String grade = data[2]; // 등급



            if (!grade.equals("P")) {
                totalCredits += credits;
                weightedSum += credits * getGradeValue(grade);
            }
        }


        double majorCredits = weightedSum / totalCredits;

        System.out.printf("%.6f\n", majorCredits);
    }

    public static double getGradeValue(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
}