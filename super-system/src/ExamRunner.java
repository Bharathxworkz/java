import java.util.Scanner;

public class ExamRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fess");
        int Fess   =scanner.nextInt();
        Exam exam = new SuplementaryExam(Fess);
        exam.getFees();
        System.out.println(Fess);


    }
}
