package OOPs;

public class Constructor {
    public static void main(String[] args) {
    //  Student S1= new Student("Anshika");   
    Student S1=new Student("Anshika");
     System.out.println(S1.name);
    Student S2=new Student();
    Student S3=new Student(5);
     System.out.println(S3.roll);
    }
}
class Student{
    String name;
    int roll;

    Student(String name){        //PARAMETERIZED CONSTRUCTOR
         this.name=name;
    }
    Student(){
         System.out.println("Constructor is called ...");   // NON PARAMETERIZED 
    }  
    Student(int roll)  {
        this.roll=roll;
    } 
    }

