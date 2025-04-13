package SendValorVsReference6;

public class SendValorVsReference {
    public static void main(String[] args) {
    /*
      * Key concepts:
    * 1. Primitive types (int, double, boolean, etc.) are passed by value
    *    - A copy of the value is passed to the method
    *    - Changes to the parameter inside the method don't affect the original variable
    * 
    * 2. Objects are passed by reference value
    *    - A copy of the reference (memory address) is passed
    *    - Changes to the object's properties inside the method affect the original object
    *    - But reassigning the parameter to a new object doesn't affect the original reference
    */


    int i = 10;
    int[] age = {8, 9, 10};

    // Passing by value
    System.out.println("Starting main method with i:" + i);
    testVal(i);
    System.out.println("Finishing main method with i(it mantains i equal):" + i);

    // Passing by ref
    System.out.println("Starting main method with age");
    for(int a = 0; a<age.length; a++){
        System.out.println("age[a] =" +age[a]);
    }
    System.out.println("Before calling testRef Method");
    testRef(age);
    System.out.println("After calling testRef Method");
    for(int a = 0; a<age.length; a++){              //Printing Modified arr values
        System.out.println("age[a] =" +age[a]);
    }
    System.out.println("Finishing main method with array data modified!");
    }
    
    // Passing by value
    public static void testVal(int i){
        System.out.println("Starting test method with i:" + i);
        i = 35;
        System.out.println("Finishing test method with i:"+ i);
    }
    
     // Passing by reference
    public static void testRef(int[] ageArr){
        System.out.println("Starting testRef method!");
        for(int a = 0; a<ageArr.length; a++){
            ageArr[a]= ageArr[a]+20;
        }
        System.out.println("Finishing testRef method!");
    }
}
