import java.util.Scanner;
public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Array must have at least three elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Take array input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("No third largest element found.");
        } else {
            System.out.println("The third largest element is: " + third);
        }

        sc.close();
    }
}
