/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture13 : Simple Inheritance
/*
    Q1. What is Simple Inheritance?
    
    => Which inheritance contains only one super-class and only one sub-class is called Simple Inheritance.

    => Syntax:
            class Super {

                // codes
            }

            class Sub extends Super {

                // codes
            }

*/


class Teachers { // super-class

    String name;
    int age;

    void input() {

        System.out.println("Enter Name and Age : ");
    }
}

class SwarupSir extends Teachers { // sub-class

    void output() {

        name = "Swarup Samanta Sir";
        age = 35;

        System.out.println(name + "  " + age);
    }

}

public class Lecture13 {
    
    public static void main(String[] args) {
        
        // we make object of sub-class.

        SwarupSir sir = new SwarupSir();

        sir.input();
        sir.output();
    }
}