class Animal {
    void sound(String name) {
        System.out.println("Animal Sound:" + name);

    }

}

class Dog extends Animal {
    void sound(String name) {
        System.out.println("Dog Class Sound Method : " + name);

    }

    void display() {
        System.out.println("This is Dog Class");
    }

}

public class main {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound("Woof");
        ((Dog) a).display(); // downcasting

    }
}
