// EXPERIMENT 9 - INHERITANCE AND METHOD OVERRIDING
//OBJECTIVE: TO IMPLEMENT AND RUNTIME POLYMORPHISM
// PROBLEM STATEMENT: CREATE BASE AND DERIVED CLASS DEMONSTRATING

class Animal{
    void sound(){
        System.out.println("Animal makes a sound.");
    }
}
class dog extends Animal{
    void sound(){
        // super.sound();
        System.out.println("Dog do BARKS!!!");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Animal A = new dog();
        A.sound();    //JVM calls Dog's overridden method at runtime
    }
}
