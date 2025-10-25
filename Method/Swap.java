package Method;

public class Swap {
    public static void main(String[] args) {
   int a=10;
   int b=5;
   System.out.println(a+" "+b+" main func");
   swap(a,b);
   System.out.println(a+" "+ b+ " main func");
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+b+" Swap func");
    }
}
