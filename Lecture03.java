
/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture03 : Constructor in Java

/*
    Q1. What is Constructor?

    => Constructor is a special type of method, whose name is same as class name.

    => The main purpose of constructor is Initializing the object.

    => Every java class has a constructor.

    => A constructor is automatically called at the time of object creation.

    => A constructor never contain any return type including void.

    => Syntax:
                class ClassName {

                    // Constructor
                    ClassName() {


                    }
                }

    => Types of Constructor:
                i) default 
                ii) parameterized
                iii) private
                iv) copy
 */

class Student {

    // objects
    String name;
    int roll;
    
    // constructor
    Student() {

        name = "Miraj";
        roll = 36;
    }

    void Print() {

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
    }

}


// Q2. Prove that :  "A constructor is automatically called at the time of object creation."

class Test {

    String name;
    int roll;


    // here, we do not create any constructor

    void Print() {

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
    }
}

public class Lecture03 {
    
    public static void main(String[] args) {
        
        Student std = new Student();
        std.Print();
        /* 
            Output
            Name : Miraj Asraf
            Roll : 36
         */

        Test t = new Test(); 
        t.Print(); 

        /*
            Output
            Name : null
            Roll : 0
         */

        //  Hence, we can say, if we do not make a constructor, java automatically creates a constructor.

    }
}
