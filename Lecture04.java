/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture04 : Default Constructor in Java

/*
    Q1. What is Default constructor?

    => A constructor which does not have any parameter is called Default constructor.

    => Syntax:
                class Class_name {

                    // no parameters
                    Class_name() {


                    }
                }


 */


class Test {

    String str;
    int num;
    boolean isTrue;

    // default constructor
    Test() {

        str = "Miraj";
        num = 36;
        isTrue = true;
    }

    void Display() {

        System.out.println(str + " " + num + " " + isTrue);
    }
}



// if we do not create any default constructor, java will creates its own constructor, and all objects value will be assigned by default.
class Demo {

    String str;
    int num;
    boolean isTrue;

    // Now, we do not create any default constructor
    // java will create its own by-default constructor
    
    void Display() {

        System.out.println(str + " " + num + " " + isTrue);
    }
}

public class Lecture04 {
    
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.Display();
        // Miraj 36 true

        Demo d = new Demo();
        d.Display();
        // null 0 false
    }
}
