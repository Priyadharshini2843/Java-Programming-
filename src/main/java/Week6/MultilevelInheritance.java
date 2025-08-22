package two;
class LivingBeing {
    void Breath() {
        System.out.println("Every Livingbeing can breath. ");
    }
    void Response() {
        System.out.println("Every Living creature can response. ");
    }
}
class Animal extends LivingBeing {
    void Walk(String animalName) {
        System.out.println(animalName+ " is walking. ");
    }
    void NoOfLegs(String animalName,int legs) {
        System.out.println(animalName+ " uses "+ legs + " legs to walk. ");
    }
}
class Cat extends Animal {
    void Meow() {
        System.out.println("Cat sound is Meow. ");
    }
}
class Dog extends Animal {
    void Bark() {
        System.out.println("Dog is barking. ");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("PRIYADHARSHINI M (2024503501) || WEEK 6 Program 2 ");
        System.out.println("--Multi Level Inheritance--");
        Cat kitty = new Cat();
        kitty.Breath();
        kitty.Response();
        kitty.Walk("Cat");
        kitty.NoOfLegs("Cat",4);
        kitty.Meow();

        Dog doggy = new Dog();
        doggy.Breath();
        doggy.Response();
        doggy.Walk("Dog");
        doggy.NoOfLegs("Dog",4);
        doggy.Bark();


    }
}
