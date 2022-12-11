/*
this is all about the inharitance
Inharitance - to transfer the properties of one class to another

base class - the main class which have properties
sub class - which extands the property
*/

/*
1- Single level inheritance - second use first
2- multilevel inharitance - second use first, third use second , fourth use third 
3- hirarchial inharitance - second use first, third use first, fourth use first
4- hybrid inharitance - the mixing of the above inharitance any class is use in the any other class no order is define
*/
class Shape{
    // String Color;
    public void area(){
        System.out.println("this shows area");
    }
}
// inharit of the shape class by triangle class
class Triangle extends Shape{
    public void area(int len, int hight){
        System.out.println(1/2*len*hight);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int len, int hight){
        System.out.println(1/2*len*hight);
    }
}

public class Inharitance {
    public static void main(String args[]){
        Triangle T1 = new Triangle();
        // T1.Color = "red";


    }    
}