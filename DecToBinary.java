import java.util.Scanner;
public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();  
        String binary = " ";
        while (num >0 ){
            int rem = num %2;
            binary= (rem + binary);
            num= num/2;
        }
        System.out.println(binary);
        sc.close();

    }
}  


// public class DecToBinary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();    
//         int ans = 0;
//         int place = 1;
//         while (num > 1){
//             int r = num % 2;
//             ans = ans + r * place;
//             place = place * 10;
//             num = num/2;
//         }
//         ans = ans + num * place;
//         System.out.println(ans);
//         sc.close();
//     }
// }