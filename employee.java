// public class employee {
//     int id;
//     int salary;
//     public static void main(String[] args) {
//         employee e1 = new employee();
//         e1.id = 22;
//         e1.salary = 10000;
//         System.out.println("ID: " + e1.id);
//         System.out.println("Salarty: " + e1.salary);
//     }
// }

class employee {
    int ID;
    double salary;

    public void display() {
        System.out.println(ID + "\n" + salary);
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.ID = 22;
        e1.salary = 100000.22;
        e1.display();
    }
}