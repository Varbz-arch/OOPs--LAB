import java.util.Scanner;
public class BinToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number: ");
        int binary = sc.nextInt();

        int ans = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            ans = ans + digit * (int) Math.pow(2, power);
            power++;
            binary = binary / 10;
        }

        System.out.println("Decimal value: " + ans);
        sc.close();
    }
}
