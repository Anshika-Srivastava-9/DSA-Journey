package OOPs;

public class SuperKey {
    public static void main(String[] args) {
     Horse h=new Horse();  
     System.out.println(h.color); 
    }
}
class Animal {
    String color;
    Animal(){
        System.out.println("This is Animal constuctor");
    }
}
class Horse extends Animal{
    
    Horse(){
        super.color="Brown";
        System.out.println("This is Horse Constructor");
    }
}
