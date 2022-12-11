//this is all about the string function
// 1-concatenation
// 2-length of string
// 3-charAt - use for find the char at any position
// 4-Compair the string
// substing function
public class lac31 {

    public static void main(String[] args) {

        String firstName = "harsh";
        String lastName = "saxena";

        //concatenatoin
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        //String Length
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //compair
        //1 s1>s2: +ve value
        //2 s1=s2: 0 value
        //3 s1<s2: -ve value

        // hello and cello are not same, it is check with the alphabetical order 

        if(firstName.compareTo(lastName)==0){
            System.out.println("Both String are equal");
        }
        else{
            System.out.println("Both String are not equal");
        }
        
        // we also use the == to check the strings are equal or not but with some exception cases
        if(new String("tony") == new String("tony")){
            System.out.println("Both String are equal");
        }
        else{
            System.out.println("Both String are not equal");
        }
        //output shows not equal but these are equal the reason behind that is the functioning of the strion builder
        //coverup in next lecture

        //substing
        //syntex
        // substing(beg index, end index)
        String str = fullName.substring(6,fullName.length());
        System.out.println(str);
        
    }

}