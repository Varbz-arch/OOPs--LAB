import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();  
        System.out.println("Numbers from 1 to " + n + " are as follows:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close(); 
    }
}
