import java.util.jar.Attributes.Name;

class Pen{
    String Color;
    String Type;

    public void write(){
        System.out.println("Writting Something");
    }
    public void printColor(){
        System.out.println(this.Color);
    }
}
class Student{
    String Name;
    int age;
    

    public void printDetails(){
        System.out.println(this.Name);
        System.out.println(this.age);

    }
    //unparametarised constractors
    //defaulted set in java

    //parameterised constractios
    Student(String Name, int age){
        this.Name = Name;
        this.age = age;
    }
}



public class opps1 {
    public static void main(String args[]){

        Pen Pen1 = new Pen();
        Pen1.Color = "blue";
        Pen1.Type = "gel";
        // Pen1.write();

        Pen Pen2 = new Pen();
        Pen2.Color= "red";
        Pen2.Type= "Ball";

        //run print color function

        // Pen1.printColor();
        // Pen2.printColor();

        //this is the student section
        // Student Student1 = new Student();  

        //constractors-to constracts the objects of java programs
        //same name of class name
        //dont have requirement of return type 

        // Student1.Name = "Aman";
        // Student1.age = 20;
        
        // Student Student2 = new Student();
        // Student2.Name = "Sanjay";
        // Student2.age = 21;

        //print details of student1
        // Student1.printDetails();
        //print the details of student2
        // Student2.printDetails();

        Student S1 = new Student("harsh", 20);
        S1.printDetails();
    }
}