package Arrays10;
import java.util.Scanner;

public class GradeSystemByCourseExample {
    public static void main(String[] args) {
        
        double [] mathClass, historyClass, scienceClass;
        int matchClassSum = 0, historyClassSum = 0, scienceClassSum = 0;
        mathClass = new double[8];
        historyClass = new double[8];
        scienceClass = new double[8];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 8 grades for math class students:");
        for (int i = 0; i < mathClass.length; i++) {
            mathClass[i] = scanner.nextDouble();
        }
        System.out.println("Enter the 8 grades for history class students:");
        for (int i = 0; i < historyClass.length; i++) {
            historyClass[i] = scanner.nextDouble();
        }
        System.out.println("Enter the 8 grades for science class students:");
        for (int i = 0; i < scienceClass.length; i++) {
            scienceClass[i] = scanner.nextDouble();
        }

        for(int i = 0; i < 8; i++) {
            matchClassSum += mathClass[i];
            historyClassSum += historyClass[i];
            scienceClassSum += scienceClass[i];
        }

        System.out.println("Average grade for Math class: " + (matchClassSum / mathClass.length));
        System.out.println("Average grade for History class: " + (historyClassSum / historyClass.length));
        System.out.println("Average grade for Science class: " + (scienceClassSum / scienceClass.length));
    }
}
