package OOPs;
public class Abstraction {
   public static void main(String[] args) {
    Mustang myHorse =new Mustang();
    // Animal--> Horse --> Mustang
   

    // Horse h=new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);

    // Chicken c=new Chicken();
    // c.eat();
    // c.walk();
   } 
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor called ");
    }
        void eat(){
        System.out.println("animal Eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse construtor called ");
    }
    void changeColor(){
        color="brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang construtor called ");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken contructor called ");
    }
     void changeColor(){
        color="brickred";
    }
    void walk(){
        System.out.println("Walk on two legs ");
    }
}
