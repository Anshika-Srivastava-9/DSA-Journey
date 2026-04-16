package OOPs;

public class Inheritence {
    public static void main(String[] args) {
     Fish Shark=new Fish();
     Shark.eat();   
     Shark.swim();
    }
}
class Animal {
    String name;
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
class Fish extends  Animal{
 int fins;
 void swim(){
    System.out.println("Swims in water ");
 }
}
