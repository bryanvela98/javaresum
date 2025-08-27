package FlowControl4;

public class PracticeExample2_GradeSystem {
    public static void main(String[] args) {
        

    /* Request 20 final grades from students on a scale of 1 to 7. Handle decimals in the grades (double). 
       Display the average of grades higher than 5, the average of grades lower than 4, and the number of grades less than 1. 
       Also display the total average.
    */
    
    // Solution

    // 1. Declare variables
    double[] grades = new double[20];
    double sumHigherThan5 = 0, sumLowerThan4 = 0, totalSum = 0;
    int countHigherThan5 = 0, countLowerThan4 = 0, countLessThan1 = 0;
    double averageHigherThan5, averageLowerThan4, totalAverage;
    // 2. Input grades
    for (int i = 0; i < grades.length; i++) {
        System.out.print("Enter grade " + (i + 1) + ": ");
        grades[i] = Double.parseDouble(System.console().readLine());
        // 3. Process grades
        if (grades[i] > 5) {
            sumHigherThan5 += grades[i];
            countHigherThan5++;
        } else if (grades[i] < 4) {
            sumLowerThan4 += grades[i];
            countLowerThan4++;
        }
        if (grades[i] < 1) {
            countLessThan1++;
        }
        totalSum += grades[i];
    }
    // 4. Calculate averages
    if (countHigherThan5 > 0) {
        averageHigherThan5 = sumHigherThan5 / countHigherThan5;
    } else {
        averageHigherThan5 = 0;
    }
    if (countLowerThan4 > 0) {
        averageLowerThan4 = sumLowerThan4 / countLowerThan4;
    } else {
        averageLowerThan4 = 0;
    }
    if (grades.length > 0) {
        totalAverage = totalSum / grades.length;
    } else {
        totalAverage = 0;
    }
    // 5. Output results
    System.out.println("Average of grades higher than 5: " + averageHigherThan5);
    System.out.println("Average of grades lower than 4: " + averageLowerThan4);
    System.out.println("Number of grades less than 1: " + countLessThan1);
    System.out.println("Total average: " + totalAverage);
    }
}
