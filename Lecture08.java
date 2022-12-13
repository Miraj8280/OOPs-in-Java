/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture08 : Constructor overloading in Java
/*
    Q1. What is Constructor overloading?

    => Whenever we have more than one constructor in our class, then it is called constructor overloading.

    => The compiler differentiates these constructors by taking into account the number of parameters in the list and their type.
*/

class Jishan {

    String name;
    int roll;
    double marks; 

    // default constructor
    Jishan() {

        name = "Miraj";
        roll = 36;
        marks = 95.50;
    }

    // parameterized constructor using String and int data type
    Jishan(String str, int val) {

        name = str;
        roll = val;
    }

    // parameterized constructor using String and double data type
    Jishan(String str, double val) {

        name = str;
        marks = val;
    }
}

public class Lecture08 {
    
    public static void main(String[] args) {
        
        Jishan obj1 = new Jishan();
        System.out.println(obj1.name + " " + obj1.roll + " " + obj1.marks);

        Jishan obj2 = new Jishan("Miraj", 36);
        System.out.println(obj2.name + " " + obj2.roll);

        Jishan obj3 = new Jishan("Gulsan", 99.50);
        System.out.println(obj3.name + " " + obj3.marks);
    }
}
