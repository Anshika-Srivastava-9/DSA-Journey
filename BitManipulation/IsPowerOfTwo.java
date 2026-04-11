package BitManipulation;

public class IsPowerOfTwo {
    public static boolean IsPowerOfTWO(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(IsPowerOfTWO(8));
    }
}
