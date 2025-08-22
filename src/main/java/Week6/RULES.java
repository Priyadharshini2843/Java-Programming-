// i. Trying to override with different return type (Invalid)
class Parent1 {
    public int show() {
        return 1;
    }
}

class Child1 extends Parent1 {
    // Compile-time error: incompatible return type
    // public String show() {
    //     return "Hello";
    // }
}

// ii. Trying to reduce visibility (Invalid)
class Parent2 {
    public void display() {
        System.out.println("Parent2 display");
    }
}

class Child2 extends Parent2 {
    // Compile-time error: cannot reduce visibility
    // private void display() {
    //     System.out.println("Child2 display");
    // }
}

// iii. Wrong overriding syntax (parameters mismatch)
class Parent3 {
    public void greet() {
        System.out.println("Hello from Parent3");
    }
}

class Child3 extends Parent3 {
    // Not overriding, just overloading
    public void greet(String name) {
        System.out.println("Hello " + name + " from Child3");
    }
}

// iv. Wrong overloading syntax (same method signature, different return type)
class OverloadError {
    // Compile-time error: same method signature
    // public int compute() { return 1; }
    // public String compute() { return "error"; }
}

// v. Covariant return type (Valid)
class Parent4 {
    public Number getValue() {
        return 42;
    }
}

class Child4 extends Parent4 {
    @Override
    public Integer getValue() {
        return 100;
    }
}

// vi. Method Overloading (Same class and across classes)
class OverloadDemo {
    public void print() {
        System.out.println("No args");
    }

    public void print(String msg) {
        System.out.println("Message: " + msg);
    }
}

class OverloadChild extends OverloadDemo {
    public void print(int num) {
        System.out.println("Number: " + num);
    }
}

// vii. Static Method Overloading
class StaticOverload {
    public static void show() {
        System.out.println("Static show()");
    }

    public static void show(String msg) {
        System.out.println("Static show(String): " + msg);
    }
}

// viii. Safe and unsafe upcasting/downcasting
class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

 class Main {
    public static void main(String[] args) {
         System.out.println("PRIYADHARSHINI M (2024503501) || WEEK 6 Program 6 "); 
        // Safe upcasting
        Animal a = new Dog(); // Dog is-an Animal
        a.sound(); // Works
        // a.bark(); // Compile-time error

        // Unsafe downcasting
        Animal a2 = new Animal();
        // Dog d2 = (Dog) a2; // Runtime error: ClassCastException

        // Safe downcasting
        Animal a3 = new Dog();
        Dog d3 = (Dog) a3; // Works
        d3.bark();
    }
}
