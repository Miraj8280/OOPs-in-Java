// Method Overloading
/*
    => Compile-time Polymorphism: A polymorphism which exists at the time of compilation is called Compile-time polymorphism.

    => It's also called as - i) Early binding or ii) Static polymorphism.

    => Method overloading: Whenever a class contain more than one method with the same name and different types of parameters is called Method overloading.
*/

class X {

    void add() {

        int a = 20;
        int b = 30;
        int c = a + b;

        System.out.println(c);
    }

    void add(int x, int y) {

        int c = x + y;
        System.out.println(c);
    }

    void add(int x, double y) {

        double c = x + y;

        System.out.println(c);
    }
}

public class Lecture20 {

    public static void main(String[] args) {
        
        X obj = new X();
        obj.add();
        obj.add(50, 60);
        obj.add(30, 40.60);
    }
}