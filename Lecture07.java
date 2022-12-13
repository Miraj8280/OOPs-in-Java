/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture07 : Private Constructor in Java

/* 
    Q1. What is Private Constructor?

    => In java, it is possible to write a constructor as private but according to the rule we can't access private members outside of class.

    => If a constructor is declared as private, then its objects are only accessible from within the declared class. We cannot access its objects from outside the constructor class.
    
    => The main purpose of using a private constructor is to restrict object creation.

    => Singleton pattern can be implemented using private constructor.

    => Syntax:
            class class_name {

                private class_name() {

                }
            }
*/

class MarkSheet {

    String name;
    int roll;
    double marks;

    // private constructor
    private MarkSheet() {

        name = "Miraj";
        roll = 36;
        marks = 90.50;

        System.out.println(name + " " + roll + " " + marks);
    }

    // accessing members from private constructor from this class (Marksheet) itself.
    public static void main(String[] args) {
        
        MarkSheet obj = new MarkSheet();
    }

} 


// now, if I want to access the members of the private constructor from another class (Lecture07) - it will give an error : "MarkSheet() has private access in MarkSheet"

public class Lecture07 {
    public static void main(String[] args) {
        
        // MarkSheet obj = new MarkSheet();
    }
}
