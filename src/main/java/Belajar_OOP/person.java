package Belajar_OOP;

public class person { // ini class
    // atribut
    String name; // field1 berupa nama
    String address; //field 2 berupa alamat
    final String country = "Indonesia"; //  field 3 berupa kata kunci final karena country tidak berubah

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
