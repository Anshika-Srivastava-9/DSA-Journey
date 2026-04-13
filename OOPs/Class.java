package OOPs;
public class Class {
   public static void main(String[] args) {
    Pen P1=new Pen();
    P1.setColr("Blue");
    P1.setTip(5);
    System.out.println("The color of pen is " +P1.color +" And its tip size is "+ P1.tip);

   } 
}
class Pen{
    String color;
    int tip;
    void setColr(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
        }
}

class Animal{

}
 