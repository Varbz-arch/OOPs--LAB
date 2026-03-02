import java.util.Scanner;

// public class user_input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(num);
//         sc.close();
//     }
// }

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of two numbers is: " + sum);
        sc.close();
    }
}


