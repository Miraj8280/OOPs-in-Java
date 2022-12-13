/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture14 : Multi-level Inheritance

/*
    Q1. What is Multi-level Inheritance?

    => In which inheritance we have only one super-class and multiple sub-classes are called Multi-level inheritance.

    => Syntax:
            class Super {

                // codes
            }

            class Sub1 extends Super {

                // codes
            }

            class Sub2 extends Sub1 {

                // codes
            }
     
*/

class A { // super-class

    int a;
    int b;
    int c;

    void Addition() {

        a = 10;
        b = 20;
        c = a + b;

        System.out.println("Addition = " + c);
    }

    void Subtraction() {

        a = 50;
        b = 30;
        c = a - b;

        System.out.println("Subtraction : " + c);
    }
}

class B extends A { // Sub1
// Now, this sub-class has also access of Addition() and Subtraction().

    void Multiplication() {

        a = 20;
        b = 10;
        c = a * b;

        System.out.println("Multiplication : " + c);
    }

    void Division() {

        a = 50;
        b = 10;
        c = a / b;

        System.out.println("Division : " + c);
    }
}

class C extends B { // sub2
// Now, this sub-class has access of Addition(), Subtraction(), Multiplication() and Division().

    void Remainder() {

        a = 25;
        b = 4;
        c = a % b;

        System.out.println("Reminder : " + c);
    }

}

public class Lecture14 {
    
    public static void main(String[] args) {
        
        // we make objec of which class which has all the access of super-class

        C obj = new C();
        obj.Addition();
        obj.Subtraction();
        obj.Multiplication();
        obj.Division();
        obj.Remainder();
    }
}