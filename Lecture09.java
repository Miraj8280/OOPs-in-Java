/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture09 : Static block in java

/*
    Q1. What is static block?

    => Static block is such kind of block in java which gets executed at the time of loading the .class file into the JVM memory.
    
    => Static blocks in Java are executed automatically when the class is loaded in memory.
    
    => Static blocks are executed before the main() method.

    => Static blocks are executed only once as the .class file is loaded to memory.

    => Static blocks cannot access non-static variables and methods.

    => Syntax :
                class class_name{

                    static {

                        // codes
                    }
                }

    A.java -> javac -> A.class -> JVM [class loader -> Byte code verifier -> Execution engine]
*/


public class Lecture09 {

    // Constructor
    Lecture09(){

        System.out.println("Khusbu Begam");
    }

    // Static block
    static {

        System.out.println("Miraj Asraf");
    }


    // Code inside Static block will executes first before the constructor.

    public static void main(String[] args) {
        
        Lecture09 obj = new Lecture09();
    }
}
