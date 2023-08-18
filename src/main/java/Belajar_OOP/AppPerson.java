package Belajar_OOP;

public class AppPerson {
    public static void main(String[] args) {
        var person = new person();//manggil class/file person.java
        
        person.name = "Moh Firdaus";
        person.address = "Yogyakarta";
        // Person.Country = "Tidak Bisa Diubah";
        // person person2 = new person();

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        
      person.sayHello("Joee");

       

    }
}
