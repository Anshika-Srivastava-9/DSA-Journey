package OOPs;

public class CopyConstructor {
    public static void main(String[] args) {

        Student S1 = new Student();
        S1.name = "Anshika";
        S1.roll = 100043;
        S1.Password = "avjghhvsa";
        S1.marks[0] = 100;
        S1.marks[1] = 70;
        S1.marks[2] = 90;

        // Copy Constructor
        Student S2 = new Student(S1);

        // Change values
        S2.Password = "XYZ";
        S1.marks[2] = 80;
       // Print S2 marks (should not change if deep copy)
        for (int i = 0; i < 3; i++) {
            System.out.println(S2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String Password;
    int marks[];

    // Copy Constructor (DEEP COPY)
    Student(Student S1) {
        marks = new int[3];
        this.name = S1.name;
        this.roll = S1.roll;
        this.Password = S1.Password;
        this.marks=S1.marks;
        }

    // Non-parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called ...");
    }

    Student(String name){
      marks = new int[3];
      this.name=name;  
    }

    // Parameterized constructor
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}