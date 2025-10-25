package Method;

public class Scope {
    static int i;

    public static void main(String[] args) {
        i = 16;
        fun();
        int i=20;
        System.out.println(i);
    }

    public static void fun() {
        System.out.println(i);
        int i=23;
        System.out.println(i);

    }
}
