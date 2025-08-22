package three;
//Base class
class LivingBeing {
    String name;
    LivingBeing(String name) {
        this.name = name;
        System.out.println("LivingBeing constructor called for: " + name);
    }

    void breath() {
        System.out.println(name + " can breathe ");
    }

    void response() {
        System.out.println(name + " responds to changing environment ");
    }
}
// Derived class 1
class LandAnimal extends LivingBeing {
    LandAnimal(String name) {
        super(name);
        System.out.println("LandAnimal constructor called for: " + name);
    }
    void walk() {
        System.out.println(name + " can walk ");
    }
    void numberOfLegs(int legs) {
        System.out.println(name + " has " + legs + " legs");
    }
}
// Derived class 2
class WaterAnimal extends LivingBeing {
    WaterAnimal(String name) {
        super(name);
        System.out.println("WaterAnimal constructor called for: " + name);
    }

    void swim() {
        System.out.println(name + " can swim");
    }

    void waterType(String type) {
        System.out.println(name + " lives in " + type + " water");
    }
}
// Subclass of LandAnimal
class Dog extends LandAnimal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called for: " + name);
    }
    void bark() {
        System.out.println(name + " is barking ");
    }
}
// Subclass of LandAnimal
class Cat extends LandAnimal {
    Cat(String name) {
        super(name);
        System.out.println("Cat constructor called for: " + name);
    }

    void meow() {
        System.out.println(name + " sound is meow ");
    }
}
class HierarchicalInheritane {
    public static void main(String[] args) {
        System.out.println("PRIYADHARSHINI M (2024503501) || WEEK 6 Program 5 ");
        System.out.println("--Hierarchical Inheritance--");
        System.out.println("Creating Dog Object");
        Dog dog = new Dog("Puppy");
        dog.breath();
        dog.response();
        dog.walk();
        dog.numberOfLegs(4);
        dog.bark();
        System.out.println("\nCreating Cat Object");
        Cat cat = new Cat("Kitty");
        cat.breath();
        cat.response();
        cat.walk();
        cat.numberOfLegs(4);
        cat.meow();

        System.out.println("\nCreating WaterAnimal Object");
        WaterAnimal wa = new WaterAnimal("Kappa");
        wa.breath();
        wa.response();
        wa.swim();
        wa.waterType("fresh");
    }
}
