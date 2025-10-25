package Maths;

public class Palindrome {
    public static void main(String[] args) {
    int n=1234321;
    int num=n;
   int rev=0;
   while(n!=0){
int ld=n%10;
 rev=rev*10+ld;
n/=10;
   }   
System.out.println(rev);
System.out.println(num);
 if(num==rev){
    System.out.println("Palindrome Number");
 }
 else
 System.out.println("Not Palindrome");
    }
   
}
