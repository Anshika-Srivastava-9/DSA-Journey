package OOPs;

public class HierarchialInheritence {
    public static void main(String[] args) {
        Mammal dog=new Mammal();
        dog.eat();
        dog.color="Black";
        System.out.println(dog.color);

        Fish Dolphin=new Fish();
        Dolphin.color="Pink";
        System.out.println(Dolphin.color);
        Dolphin.Swim();
         
        Bird Peacock=new Bird();
        Peacock.color="Valvet";
        System.out.println(Peacock.color);
        Peacock.fly();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void Swim(){
        System.out.println("Swims in water ");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly in sky");
    }
}
