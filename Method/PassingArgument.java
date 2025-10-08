package Method;

public class PassingArgument {

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void greet(String name) {
        System.out.println("Hi, Good Morning " + name);
    }

    public static void main(String[] args) {
        // greet("Anshika");
        // greet("Priyam");
        // sum(4, 3);

        StudentDetail("Anshika", 21,"A",580 );
        StudentDetail("Anamika", 20,"A",540 );
        StudentDetail("Abhiya", 21,"A",570 );
        StudentDetail("Akasha", 19,"A",500 );
        StudentDetail("Amrita", 20,"A",540 );
    }



    public static void StudentDetail(String name ,int age ,String grade,int marks) {
    System.out.println("Hello "+name+ " your age is "+age+" your grade is "+grade+" your marks is "+marks);  
    }
}
// java Method.PassingArgument
// javac Method\PassingArgument.java

