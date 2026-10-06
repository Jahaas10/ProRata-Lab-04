import java.util.Scanner;

public class IT25102586Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPct = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPct = scanner.nextDouble();

        if ((examPct + labPct) != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;
        }

        double finalMark = (examMarks * examPct / 100.0) + (labMarks * labPct / 100.0);
        System.out.println("Final Exam Mark is : " + finalMark);

        scanner.close();
    }
}