/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture02 : Class and Object in Java

/*

    Q1. What is Class?

    => Class is a collection of objects and it doesn't take any space on memory.

    => class is also called as blueprint/logical entity.

    => There are two types of class : 
        i) Pre-defined - Already defined by java developers, we cann't make any change on these, we can only use these.
            - Scanner
            - Console
            - System
            - String
            etc.

        ii) User defined - Which classes are defined by us. We write programs inside these classes.
            - Students
            - Family
            - A
            - Test
            etc;
*/



/*
    Q2. What is Object?

    => Object is an instance of a class which executes the class.

    => Once the object is created, it takes up space like other variables in memory.

    => Syntax:
        class_name obj_name = new class_name();

        * class_name : Name of the Class
        * obj_name : Name of the object (object reference variable)
        * new : Dynamic Memory Allocation.
        * class_name() : Constructor.

*/





// Defined a class Students
class Students {

    // Objects
    String name = "Miraj Asraf";
    int roll = 36;
    String semester = "5th";
    String department = "Computer Science & Engineering";

    void Print() {

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("Semester : " + semester);
        System.out.println("Department : " + department);
    }
}

public class Lecture02 {

    public static void main(String[] args) {

        // create a object reference variable to access the class Students
        //Syntax: class_name obj_name = new class_name();

        Students std = new Students();
        std.Print();
    }
}

