package Arrays10;

import java.util.Scanner;

public class SearchNumberInArr {
    public static void main(String[] args) {
        
        int [] a = new int[10];

        // Number to search for
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Enter number :");
            a[i] = scanner.nextInt();
        }

        int targetNum = scanner.nextInt();
        System.out.println("Enter number tu search:");

        int i = 0;
        while (i < a.length && a[i] != targetNum) {
            i++;            
        }
        if(i == a.length){
            System.out.println("Number not found");
        } else if(a[i] == targetNum){
            System.out.println("Number found at index:" + i);
        }
    }

}
