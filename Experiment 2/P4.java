public class P4 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java Program4_StudentGrade <Name> <Mark1> <Mark2> <Mark3>");
            return;
        }
        String name = args[0];
        int m1 = Integer.parseInt(args[1]);
        int m2 = Integer.parseInt(args[2]);
        int m3 = Integer.parseInt(args[3]);

        double average = (m1 + m2 + m3) / 3.0;

        System.out.printf("Student: %s%n", name);
        System.out.printf("Average Marks: %.2f%n", average);
    }
}