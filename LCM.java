import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("Lcm of " +a+ " and " +b+ " is " +max); 
                break;
            }
            max++;
        }
        sc.close();
    }
}


// import java.util.Scanner;

// public class LCM {

//     static int findLCM(int a, int b) {
//         int max = (a > b) ? a : b;
//         int lcm = max;

//         while (true) {
//             if (lcm % a == 0 && lcm % b == 0) {
//                 return lcm;   
//             }
//             lcm++;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int lcm = findLCM(a, b);
//         System.out.println(lcm);

//         sc.close();
//     }
// }
