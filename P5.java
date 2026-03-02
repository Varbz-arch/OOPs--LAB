import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide base number as command line argument.");
            return;
        }
        int base = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.printf("%d raised to power %d is %.2f%n", base, exponent, result);
        sc.close();
    }
}
