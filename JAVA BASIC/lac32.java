//this is all about the string builder in java
// string in java is immutable
// we don't directly change the value of any string the we are use the string builder it provide the simple and easy method for string

// when we are create the string and then we are add some some words on string 
//then it take much time to create or delete the memory in heap and it is the
//lots of time taking then we are use the string builder it take the whole 
//string as a object and the their is no requirement to delete the heap 
//memory again and again.

public class lac32 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Harsh");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char at index 0
        sb.insert(2, 'a');
        System.out.println(sb);

        // delete the extra a
        sb.delete(2, 3);
        System.out.println(sb);

        //append - add the things on the end of the string
        sb.append("e");
        System.out.println(sb);

        //the good things for the string 
        StringBuilder name = new StringBuilder("h");
        name.append("e");
        name.append("l");
        name.append("l");
        name.append("o");
        System.out.println(name);
        //never delete or recreate the heap memory so it is not a time consuming process and it is good for increse the performance of the program

    }
}
