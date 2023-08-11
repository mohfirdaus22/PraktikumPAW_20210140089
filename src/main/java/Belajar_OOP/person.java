package Belajar_OOP;

public class person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    // person(String paramName, String paramAddress) {
    // name = paramName;
    // address = paramAddress;
    // }

    
    // alternatif Panggil
    // var person = new person

    // Method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + " " + ", My Name is " + " " + name);
    }
}
