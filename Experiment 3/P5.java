public class P5 {
    public static void main(String[] args) {
        int a = 5;   
        int b = 22;   
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT of a: " + (~a));
        System.out.println("Left Shift a: " + (a << 1));
        System.out.println("Right Shift a: " + (a >> 1));
    }
}