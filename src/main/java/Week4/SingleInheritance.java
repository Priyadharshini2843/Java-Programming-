public class LivingBeing {
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
class SingleInheritance{
    public static void main(String[] args){
        Animal ani = new Animal();
        System.out.println("PRIYADHARSHINI M (2024503501) || WEEK 6 Program 1 ");
        ani.Breath();
        ani.Response();
        ani.Walk("Goat");
        ani.NoOfLegs("Goat",4);
    }
}
