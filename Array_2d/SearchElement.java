package Array_2d;
import java.util.Scanner;
public class SearchElement {
    public static boolean Search(int matrix[][],int key){
        int n=matrix.length;
        int m=matrix[0].length;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           if(matrix[i][j]==key){
            System.out.println("Element is found at (" +i+","+j+" )");
            return true;
           } 
        }
    }
           System.out.println("Elemet not in matrix");
           return false;

}
     public static void Matrix(int matrix[][]){
        Scanner sc=new Scanner (System.in);
        int n=matrix.length; int m=matrix[0].length;
        System.out.println("Enter the elements of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Matrix is :");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
     }
     System.out.println();
    }
}
     public static void main(String[] args) {
        int key=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int n=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        Matrix(matrix);
        Search(matrix,key);
     }
    }
    

