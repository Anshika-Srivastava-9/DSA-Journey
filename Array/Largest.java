package Array;

public class Largest {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
         return largest;
    }
    public static void main(String[] args) {
        int numbers[]={3,2,5,6,34,67,23,4,9};
        System.out.println("Largest value is "+ getlargest(numbers));
    }
}
