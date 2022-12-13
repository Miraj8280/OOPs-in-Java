 /*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture10 : Instance block in java

/*
    Q1. What is Instance block?

    => Instance block is similar to method which has no name.

    => It can be written inside a class only, but not inside a method.

    => It always executed before the constructor.

    => We can use variables only inside the instance block, but not method.

    => We write time consuming code inside a instance block like JDBC connectivity.

    => Syntax:
                class class_name {

                    {
                        //codes
                    }
                }
*/

class Gulsan {

    int i;
    double d;

    // Constructor
    Gulsan() {

        i = 50;
        d = 49.50;

        System.out.println(i + " " + d);
    }

    // Instance block
    {
        i = 90;
        d = 89.50;

        System.out.println(i + " " + d);
    }


    // Static block
    static {

        // i = 30;
        // d = 29.50;
        // Static blocks cannot access instance (non-static) variables and methods.

        System.out.println("Miraj Asraf");
    }
}

// Codes inside Instance block will execute first before the constructor, but codes inside Static blocks will execute first even before Instance block

public class Lecture10 {
    
    public static void main(String[] args) {
        
        Gulsan obj = new Gulsan();
    }
}
