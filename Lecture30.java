// Multiple inheritance using Interface
/*
    => We can achieve multiple inheritance through interfaces because, interface contains only abstract method, which implementation is provided by the sub classes.
*/

interface A {

    void Print();

}

interface B {

    void Print();
}

public class Lecture30 implements A, B{

    public void Print() {

        System.out.println("Interface A & B");
    }

    public static void main(String[] args) {
        
        Lecture30 obj = new Lecture30();
        obj.Print();
    }
}