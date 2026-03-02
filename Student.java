// import java.util.Scanner;
// public class Student {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);  

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.print("Enter your marks: ");
//         float marks = sc.nextFloat();
        
//         System.out.println("Name  : " + name);
//         System.out.println("Age   : " + age);
//         System.out.println("Marks : " + marks);

//         sc.close();  // Close the Scanner
//     }
// }


// package oops;
// //direct print in main
// public class Student {
//     int rollno;
//     String name;
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.rollno = 22;
//         s1.name = "ARCHISHA";
//         System.out.println("Roll No: " + s1.rollno);
//         System.out.println("Name: " + s1.name);
//     }
// }


// //display() belongs to the Student object
// class Student {
//     int rollno;
//     String name;

//     public void display() {
//         System.out.println(rollno + "\n" + name);
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.rollno = 22;
//         s1.name = "Archisha";
//         s1.display();
//     }
// }


// class Student {
//     int rollno;
//     String name;

//     public void display(Student s1) {
//         System.out.println(s1.rollno + "\n" + s1.name);
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.rollno = 22;
//         s1.name = "Archisha";
//         s1.display(s1);
//     }
// }

// class Student {

//     int rollNo;
//     String name;
//     int age;

//     // Display method
//     public void display() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Student s = new Student();

//         s.rollNo = 22;
//         s.name = "Archisha";
//         s.age = 20;

//         s.display();
//     }
// }

// ENCAPSULATION
// class Student {
//     private int rollNo;
//     private String name;
//     private int age;

//     // public void setStudent(int r, String n, int a) {
//     //     rollNo = r;
//     //     name = n;
//     //     age = a;
//     // }

//     public void setStudent(int rollNo, String name, int age) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.age = age;
//     }

//     public void display() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setStudent(22, "Archisha", 20);
//         s.display();
//     }
// }

// //MULTIPLE INHERITANCE
// interface StudentInfo {
//     void setData(int rollNo, String name);
// }
// interface StudentAge {
//     void setAge(int age);
// }
// class Student implements StudentInfo, StudentAge {

//     int rollNo;
//     String name;
//     int age;

//     public void setData(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     void display() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setData(22, "Archisha");
//         s.setAge(20);
//         s.display();
//     }
// }



class Calculator {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
class Student{
    int rollNo;
    String name;
    int age;
    Student(){
        rollNo = 0;
        name= "Not assigned";
        age= 0;
}
Student(int r, String n){
    rollNo= r;
    name = n;
}
Student(int r, String n, int a){
    rollNo= r;
    name= n;
    age = a;
}
public void display(){
    System.out.println("Roll number: " +rollNo+ "Name: " +name);
    System.out.println("Roll number: " +rollNo+ "Name: " +name+ "Age: " +age);
}
public static void main(String[] args){
    Calculator c = new Calculator();

    System.out.println("Add of 2 Integers: " +c.add(10, 20));
    System.out.println("Add of 3 Integers: "+c.add(10,20,30));
    System.out.println("Add of two double numbers: "+ c.add(20.22, 140.99));

    Student s1 = new Student();
    Student s2 = new Student(10, "AB");
    Student s3 = new Student(10, "AB", 22);
    s1.display();
    s2.display();
    s3.display();
}
}
