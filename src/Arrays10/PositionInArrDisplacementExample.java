package Arrays10;

public class PositionInArrDisplacementExample {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        int displacement = 2;
        int newPosition = (0 + displacement) % array.length;
        System.out.println("New position: " + newPosition);
        

        System.out.println("Value at new position: " + array[newPosition]);
    }
}
