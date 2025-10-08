package Method;

public class ReturnKeyword {

    public static void greet(int time) {
        if (time < 0)
            return; // iske aage koi work nhi hoga because return keyword lg ho gya h
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {
        greet(4);
    }
}
