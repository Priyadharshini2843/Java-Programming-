package four;
class Animal {
    void move() {
        System.out.println("Animal is moving...");
    }
    void move(String direction) {
        System.out.println("Animal moves towards " + direction + ".");
    }
    void move(int distance) {
        System.out.println("Animal moves " + distance + " meters.");
    }

    void move(String direction, int distance) {
        System.out.println("Animal moves " + distance + " meters towards " + direction + ".");
    }
}
class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dog runs swiftly.");
    }
    @Override
    void move(String direction) {
        System.out.println("Dog runs towards " + direction + ".");
    }

    @Override
    void move(int distance) {
        System.out.println("Dog runs " + distance + " meters.");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Dog runs " + distance + " meters towards " + direction + ".");
    }
}
class Cat extends Animal {
    @Override
    void move() {
        System.out.println("Cat sneaks quietly.");
    }

    @Override
    void move(String direction) {
        System.out.println("Cat sneaks towards " + direction + ".");
    }

    @Override
    void move(int distance) {
        System.out.println("Cat sneaks " + distance + " meters.");
    }

    @Override
    void move(String direction, int distance) {
        System.out.println("Cat sneaks " + distance + " meters towards " + direction + ".");
    }
}
class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Bird flies gracefully.");
    }
    @Override
    void move(String direction) {
        System.out.println("Bird flies towards " + direction + ".");
    }
    @Override
    void move(int distance) {
        System.out.println("Bird flies " + distance + " meters.");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Bird flies " + distance + " meters towards " + direction + ".");
    }
}
class Polymorphism {
    public static void main(String[] args) {
        System.out.println("PRIYADHARSHINI M (2024503501) || WEEK 6 Program 3 ");
        System.out.println("=== Runtime Polymorphism ===");
        Animal[] animals = { new Dog(), new Cat(), new Bird() };
        for (Animal a : animals) {
            a.move();
        }
        System.out.println("\n=== Compile-time Polymorphism ===");
        Dog dog = new Dog();
        dog.move();
        dog.move("north");
        dog.move(20);
        dog.move("east", 15);
    }
}
