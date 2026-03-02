import java.util.Scanner;
// Accept name and age using Scanner and display formatted output.
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.printf("Hey %s!! You are %d years old.%n", name, age);

        sc.close();
    }
}