import java.util.Scanner;

public class PinpointingTheClosestNeighbours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ClosestNeighbour calculator = new ClosestNeighbour(array);
        int index = calculator.findClosestNeighbor();

        System.out.println("The index of the first number with the smallest distance to its neighbor is: " + index);
    }
}