package OOPs;

public class HybridInheritence {
    public static void main(String[] args) {
    Shark s=new Shark();
    s.Swim();
    s.breath();
    
    Human h=new Human();
    h.Speak();
    h.Blood();
    }
}
class Animal{
    String color;
    String name;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swims in water ");
    }
    void fins(){
        System.out.println("use fins to swim");
    }
}
 
class Shark extends Fish{
    void teeth(){
        System.out.println("Have sharp teeth");
    }
}

class Mammal extends Animal{
  void legs(){
    System.out.println("Have legs");
  }
  void Blood(){
    System.out.println("Are warm blooded");
  }
}

class Human extends Mammal{
    void Speak(){
        System.out.println("Have vocal cord");
    } 
}
