package OOPs;
public class StaticKey {
public static void main(String[] args) {
  Student S1=new Student();
  S1.SchoolName="JVM";
  System.out.println(S1.SchoolName);  
  Student S2=new Student();
  System.out.println(S2.SchoolName);
}    
}
class Student{
    String name;
    int roll;
    static String SchoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
