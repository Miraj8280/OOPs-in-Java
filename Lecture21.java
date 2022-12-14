// Method overriding
/*
    => Run-time polymorphism: A polymorphism which exists at the time of execution of the program is called Run-time polymorphism.

    => Method overriding : Whenever we write method in super and sub-classes in such a way that method name and parameter must be same, is called Method overriding.
*/

class Super {

    void Say() {

        System.out.println("I'm Super");
    }
}

class Sub extends Super {

    @Override
    void Say() {
        super.Say();
        System.out.println("I'm Sub");
    }
}

public class Lecture21 {
    
    public static void main(String[] args) {
        
        Super obj = new Sub();
        obj.Say();

    }
}