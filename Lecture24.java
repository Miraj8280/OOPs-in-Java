
// Abstract class:
/*
    => A class which contains the 'abstract' keyword in its declaration is called abstract class.

    => We can not create any object of a abstract class.

    => We can create object referance variable of a abstract class and the objects will be of sub-class.

    => To use an abstract class, we have to inherite it from its sub-class.
*/

abstract class Animal {
    void print() {
        System.out.println("All animals");
    }
}

class Tiger extends Animal {

    void print() {
        super.print();
        System.out.println("Tiger");
    }
}
public class Lecture24 {
    
    public static void main(String[] args) {
        
        Animal obj = new Tiger();
        obj.print();
    }
}