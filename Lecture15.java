/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

// Lecture15: Multiple Inheritance
/*
    Q1. What is Multiple Inheritance?
    
    => In which inheritance, we have multiple super-class, but only one sub-class, this is calles Multiple Inheritance.

    Q2. Why Java doesn't support multiple inheritance?

    => Whenever a sub-class wants to inherit the property of two or more super-classes that have same methos, java compiler can't decide which class method it should inherit.
    Then their might be a chance of memory duplication.
    That's why java doesn't support multiple inheritance through classes.


    // Example:
                class A { // supper1

                    void method() {


                    }
                }

                class B { // supper - 2

                    void method() {


                    }
                }

                class C extends A, B { // sub-class

                    // C is in confusion
                }
*/


public class Lecture15 {
    
}