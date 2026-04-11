package BitManipulation;

public class ClearLastIthBits {
  public static int Clearithbit(int n,int i){
    int bitmask=(~0)<<i;
    return n&bitmask;
  }  
  public static void main(String[] args) {
    System.out.println(Clearithbit(15, 2));
  }
}
