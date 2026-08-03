public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aayush";
        s1.roll = 123;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);   // We want the properties of s1 to be copied in s2!
        s2.password = "xyz";

        s1.marks[1] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // Copy Constructor
    Student(Student s){
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        // this.password = s.password;
        // this.marks = s.marks; // Only the reference of the array got copied not the whole array!
        // To fully copy the elements we need to do this:
        for (int i=0;i<3;i++){
            this.marks[i] = s.marks[i];
        }
    }

    Student(String name){ // Type 1
        marks = new int[3];
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }

    Student(){ // Type 2
        System.out.println("Constructor  is called...!");
        marks = new int[3];
    }
}

// Types of Constructors:
// 1. Parameterized
// 2. Non - Parameterized
// 3. Copy Constructor