public class P3 { 
    public static void main(String[] args) { 
        if (args.length != 2) { 
            System.out.println("Please provide exactly two numbers."); 
            return; 
        } 
        int num1 = Integer.parseInt(args[0]); 
        int num2 = Integer.parseInt(args[1]); 
        int sum = num1 + num2; 
        System.out.printf("Sum of %d and %d is %d%n", num1, num2, sum); 
    } 
}