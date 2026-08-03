public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breaths");
    }
}

// Derived Class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims in water");
    }
}
