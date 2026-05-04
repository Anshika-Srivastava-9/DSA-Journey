package Recursion;

public class FrndsPairingProb {
   public static int pairingFriends(int n) {
    if(n==1|| n==2){
        return n;
    }
    // choices
    // SINGLE 
    int fnm1=pairingFriends(n-1);

    // Pair
    int fnm2=pairingFriends(n-2);


    // totalWays
    int pairWays=(n-1)*fnm2;
    int totalWays=fnm1+pairWays;
    return totalWays;
   }
   public static void main(String[] args) {
    System.out.println(pairingFriends(3));
   }
}
