package OOPs;

public class MultiLevelInheritence {
public static void main(String[] args) {
    Dog dobby=new Dog();
    dobby.Eat();
    dobby.leg=4;
    System.out.println(dobby.leg);
}
}
class Animal{
    String name;
    String color;
    void Eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
 int leg;
}

class Dog extends Mammal{
    String breed;
}
