import java.util.Scanner;
    public class InsertSearchDelete {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Original array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Enter the element to insert: ");
            int element = scanner.nextInt();
            int index = 0;
            while (index < size && arr[index] < element) {
                index++;
            }
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = element;
            size++;
            System.out.println("Updated array after insertion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Enter the element to search for: ");
            element = scanner.nextInt();
            index = 0;
            while (index < size && arr[index] != element) {
                index++;
            }
            if (index < size) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
