package FlowControl4;

public class SentencesLoopIntro {

    public static void main(String[] args) {

    // While loop
    // The while loop is a control structure in Java that allows you to execute a block of code repeatedly as long as a specified condition is true.
    // It consists of a condition that is checked before each iteration, and if the condition is true, the block of code inside the loop is executed. The while loop is commonly used when you don't know the number of iterations in advance and want to continue looping until a certain condition is met.
    // It is important to ensure that the condition eventually becomes false; otherwise, you may create an infinite loop.

    int j = 0; // Initialize counter
    while (j < 5) { // Condition to check
        // Block of code to execute
        System.out.println("Iteration: " + j);
        j++; // Increment the counter to avoid infinite loop
    }

    // For loop
    // The for loop is a control structure in Java that allows you to execute a block of code a specific number of times.
    // It consists of three parts: initialization, condition, and increment/decrement. The initialization is executed once at the beginning of the loop, the condition is checked before each iteration, and the increment/decrement is executed after each iteration.
    // The for loop is commonly used when you know the number of iterations in advance and want to iterate over a range of values or elements in a collection.
    // It is a concise way to express the loop and is often used for iterating over arrays or collections.
    
    for (int i = 0; i < 5; i++) { // Initialization; Condition; Increment
        System.out.println("Iteration: " + i); // Block of code to execute
    }

    // Do-while loop
    // The do-while loop is a control structure in Java that allows you to execute a block of code at least once and then repeatedly as long as a specified condition is true.
    // It consists of a block of code that is executed first, followed by a condition that is checked after each iteration. If the condition is true, the loop continues; otherwise, it exits.
    // The do-while loop is useful when you want to ensure that the block of code is executed at least once, regardless of the condition.
    // It is commonly used for user input validation or when you want to perform an action at least once before checking a condition.

    int k = 0; // Initialize counter
    do {
        // Block of code to execute
        System.out.println("Iteration: " + k);
        k++; // Increment the counter
    }
    while (k < 5); // Condition to check}
    }
    // The do-while loop is similar to the while loop, but the key difference is that the block of code inside the do-while loop is executed at least once before checking the condition.
    // This makes it useful for scenarios where you want to ensure that the code runs at least once, even if the condition is initially false.

}

