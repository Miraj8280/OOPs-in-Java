/*
--------------------------------------------------------------
            Object Oriented Programming in Java

                - by Miraj Asraf -
--------------------------------------------------------------
 */

//  Lecture06 : Copy Constructor in Java

/*
    Q1. What is Copy Constructor?

    => Whenever we pass object reference to the constructor, it is called copy constructor.

    => Purpose: we can copy objects of a class to another class by the help of object reference variable.

    => Syntax : 
                class class_name {

                    class_name(class_name ref) {


                    }
                }

                // ref => object reference variable

*/

// copy object variables from default constructor
class Miraj {

    String str;
    int value;

    // default constructor
    Miraj() {

        str = "Mahir";
        value = 16;

        System.out.println(str + " " + value);
    }

    // copy constructor
    // copies objects of the above constructor
    Miraj(Miraj ref) {

        str = ref.str;
        value = ref.value;

        System.out.println(str + " " + value);
    }
}
 
// copy object variables form parameterized constructor
class Khusbu {

    String str;
    int value;

    // parameterized constructor
    Khusbu(String name, int date) {

        str = name;
        value = date;

        System.out.println(str + " " + value);
    }

    // copy constructor
    Khusbu(Khusbu ref) {

        str = ref.str;
        value = ref.value;

        System.out.println(str + " " + value);
    }
}

public class Lecture06 {
    
    public static void main(String[] args) {

        Miraj obj1 = new Miraj();
        Miraj obj2 = new Miraj(obj1);

        // obj1 => object reference variable of the default constructor
        // obj2 => object reference variable of the copy constructor
        // copy constructor copies all objects of the default constructor by the help of obj2.

        Khusbu obj3 = new Khusbu("Miraj", 10);
        Khusbu obj4 = new Khusbu(obj3);
    }

}
