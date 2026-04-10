package BitManipulation;
public class EvenAndOdd{
   public static void EvenOrOdd(int n){
    int bitmask=1;
    if((n & bitmask )== 0){
        System.out.println("Even Number");
    }
    else{
        System.out.println("Odd Number");
    }
   }
   public static void main(String[] args) {
    EvenOrOdd(9);
    EvenOrOdd(11);
    EvenOrOdd(4);
   }
   }
 