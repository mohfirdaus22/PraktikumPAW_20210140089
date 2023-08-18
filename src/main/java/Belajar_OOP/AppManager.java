package Belajar_OOP;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Joe";
        manager.sayHello("Firdaus");

        var vicePresident = new VicePresident();
        vicePresident.name = "Moh";
        vicePresident.sayHello("Joe");
    }
}
