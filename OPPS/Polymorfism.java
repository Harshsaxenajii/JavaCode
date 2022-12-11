/*
if we have same named function but the funcationality of these function is much different the when we are by passing 
params if find the sufficient function which give the compleat information about the pass params and then print this is 
called polymorfism

these are two type--
1- Compile type
2- run type polymorfism

here is all about the compile type polymorfism
*/
class Student {
    String Name;
    int age;

    public void printInfo(String Name, int age) {
        System.out.println(Name + " " + age);
    }

    public void printInfo(String Name) {
        System.out.println(Name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}

public class Polymorfism {
    public static void main(String args[]) {
        Student S1 = new Student();
        S1.Name = "harsh";
        S1.age = 20;

        S1.printInfo(S1.age);
        S1.printInfo(S1.Name);
        S1.printInfo(S1.Name, S1.age);
    }
}
