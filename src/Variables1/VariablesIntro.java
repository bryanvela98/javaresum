package Variables1;

public class VariablesIntro {
    public static void main(String[] args){
        /* 
         * Variables:
         * Principal data Types:
         * - Primitive: Contain one value and it include types like integer, float, caract, boolean, etc,
         * - Reference: Contain referenced data like arrays, classes and interfaces.
         */
        
         //How to define a variable: 
            int number = 10; // dataType variableName

        /* Rules to define a variables:
         * 1. the name must start with a lowercase.
         * 2. must be a character set included in Unicode.
         * 3. the name can't be the same as reserved word or boolean value (true/false)
         * 4. if the var is composed by more of two words, and should use camel case (nameVariable)
         */

         //Example of variables

        String greeting = "Hi World from Java"; //String(Object) variable
        int number1 = 10; //int(primitive) var

        var number3 = 15; //Flexible variable(it will assume the assigned data type)
    }

}
