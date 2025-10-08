package Method;

public class MoreAboutMethod {
    public static void main(String[] args) {
        System.out.println("yo yo ");
        fun();
        System.out.println("Gian");
    }

    public static void fun() {
        System.out.println("Hi ,Good Morning !");
        fun2();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void fun2() {
        System.out.println("How are you ?");
        fun3();
    }

    public static void fun3() {
        System.out.println("Tell me something about your day");
    }
}
