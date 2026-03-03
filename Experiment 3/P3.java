public class P3 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));

        boolean condition1 = (x < y);
        boolean condition2 = (y > 15);

        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || false));
        System.out.println("Logical NOT: " + (!condition1));
    }
}