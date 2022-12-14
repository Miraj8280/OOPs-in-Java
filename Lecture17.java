

// Super keyword 
/*
    => Super keyword refers to the objects of super-class.

    => It's used when we want to call the super-class variable, method and constructor throgh a sub-class object.

    => Whenever the super-class and sub-class variable and method name both are same, then it can be used only.

    => To avoid confusion between super-class and sub-class variable and method that have same name, we should use super keyword.
*/

class E {

    int a = 50;
}

class D extends E {

    int a = 30;

    void print() {

        System.out.println(super.a);
    }
}




// Access Method from super-class
class M {

    void print() {

        System.out.println("Miraj Asraf");
    }
}

class K extends M {

    void print() {

        super.print();
        System.out.println("Khusbu Begam");
    }
}


public class Lecture17 {

    public static void main(String[] args) {
        
        K obj = new K();
        obj.print();

        D obj2 = new D();
        obj2.print();
    }
}