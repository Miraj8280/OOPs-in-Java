/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture05 : Parameterized Constructor in Java

/*
    Q1. What is Parameterized constructor?

    => A constructor through which we can pass one or more parameters, is called Parameterized constructor.

    => Syntax:
                class Class_name {

                    Class_name(int x, String y) {


                    }
                }
 */

class Khusbu {

    int x, y;

    // parameterized constructor
    Khusbu(int a, int b) {

        x = a;
        y = b;
    }

    // we can create more than one parameterized constructor.

    // In parameterized constructor, we can only pass primitive data types.

    // But, we can not create a parameterized constructor of same types of parameters. we have to pass more parameters or we have to change the type of the parameters, because it will cause Overriding.

    Khusbu(int a, String name) {

        System.out.println(a + " " + name);
    }



    int Sum() {

        return x + y;
    }
}



public class Lecture05 {
    
    public static void main(String[] args) {
        
        Khusbu k = new Khusbu(10, 20);
        System.out.println(k.Sum());
        // 30

        Khusbu m = new Khusbu(50, "Miraj");
    }
}
