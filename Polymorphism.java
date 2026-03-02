//EXPERIMENT 8 - METHOD OVERLOADING AND CONSTRUCTORS
//OBJECTIVE: TO DEMONSTRATE COMPLIE TIME POLYMORPHISM
// PROBLEM STATEMENT: IMPLEMENT METHOD AND CONSTRUCTOR OVERLOADING IN JAVA

class calculator {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

class Student {
    int rollNo;
    String name;
    int age;

    Student(){
        rollNo = 0;
        name = "Not assigned";
        age = 0;
    }

    Student(int r, String n){
        rollNo = r;
        name = n;
    }

    Student(int r, String n, int a){
        rollNo = r;
        name = n;
        age = a;
    }

    public void display(){
        System.out.println("Roll number: " + rollNo + " Name: " + name + " Age: " + age);
    }
}

public class Polymorphism {     //NO INHERITANCE IS NEEDED FOR COMPLIE TIME IN METHOD OVERLOADING
    public static void main(String[] args){

        calculator c = new calculator();

        System.out.println("Add of 2 Integers: " + c.add(10, 20));
        System.out.println("Add of 3 Integers: " + c.add(10, 20, 30));
        System.out.println("Add of two double numbers: " + c.add(20.22, 140.99));

        Student s1 = new Student();
        Student s2 = new Student(10, "AB");
        Student s3 = new Student(10, "AB", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}


// public class Calculator {
//     public int add(int a, int b){
//         return a+b;
//     }
//     public int add(int a, int b, int c){
//         return a+b+c;
//     }
//     public double add(double a, double b){
//         return a+b;
//     }
// }

// class Student{
//     int rollNo;
//     String name;
//     int age;

//     Student(){
//         rollNo = 0;
//         name= "Not assigned";
//         age= 0;
//     }

//     Student(int r, String n){
//         this.rollNo= r;
//         this.name = n;
//     }

//     Student(int r, String n, int a){
//         rollNo= r;
//         name= n;
//         age = a;
//     }

//     public void display(){
//         System.out.println("Roll number: " + rollNo + " Name: " + name);
//     }

//     public static void main(String[] args){
//         Calculator c = new Calculator();

//         System.out.println("Add of 2 Integers: " + c.add(10, 20));
//         System.out.println("Add of 3 Integers: "+ c.add(10,20,30));
//         System.out.println("Add of two double numbers: "+ c.add(20.22, 140.99));

//         Student s1 = new Student();
//         Student s2 = new Student(10, "AB");
//         Student s3 = new Student(10, "AB", 22);

//         s1.display();
//         s2.display();
//         s3.display();
//     }
// }
