package Belajar_OOP;

public class person { // ini class
    // atribut
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    person(String paramName) {
        this(paramName, null);
    }

    person() {
        this(null);
    }

    // method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);

    }
}
