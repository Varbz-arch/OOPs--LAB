class Student {    //SINGLE INHERITANCE
    int rollNo;
    String name;
    int age;

    void setData(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }
}
class StudentDetails extends Student {

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.setData(22, "Archisha", 20);
        s.display();
    }
}

// abstract class Student {

//     int rollNo;
//     String name;
//     int age;

//     void setData(int rollNo, String name, int age) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.age = age;
//     }
//     abstract void display();   
// }

// class StudentDetails extends Student {

//     void display() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Student s = new StudentDetails();
//         s.setData(22, "Archisha", 20);
//         s.display();
//     }
// }
