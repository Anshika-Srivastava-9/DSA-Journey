package Method;

import java.util.Scanner;

public class PermAndComb {

    public static int fact(int x) {
        int xfact = 1;
        for (int i = 1; i <= x; i++) {
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int rfact = fact(r);
        int n_rfact = fact(n - r);

        int nCr = nfact / (rfact * n_rfact);
        int npr=fact(n)/fact(n-r);

        System.out.println(nCr);
        System.out.println(npr);

        // int nfact = 1;
        // for (int i = 1; i <= n; i++) {
        // nfact *= i;
        // }
        // System.out.println("n factorial is " + nfact);

        // int n_rfact = 1;
        // for (int i = 1; i <= n - r; i++) {
        // n_rfact *= i;
        // }
        // System.out.println("N-R factorial is " + n_rfact);

        // int rfact = 1;
        // for(int i =1; i<= r; i++)
        // {
        // rfact *= i;
        // }
        // System.out.println("r factorial is "+rfact);

        // int nCr= nfact/(rfact*n_rfact);
        // System.out.println(nCr);
    }
}
// javac Method\PermAndComb.java
// java Method.PermAndComb
