package OOPs;
public class Class {
   public static void main(String[] args) {
    Pen P1=new Pen();
    P1.setColr("Blue");
    P1.setTip(5);
    System.out.println("The color of pen is " +P1.color +" And its tip size is "+ P1.tip);
    BankAccount myAccount=new BankAccount();
    myAccount.name="AnshikaSrivastava";
    System.out.println(myAccount.name);
    // myAccount.Password="absdjqwbiud";  CANNOT SET IT AS IT IS PRIVATE AND CANNOT BE ACCESSED OUTSIDE THE CLASS
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

class BankAccount{
    public String name;
    private String Password;
}