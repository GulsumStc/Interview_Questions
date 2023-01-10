package J00_Interview_Questions;

public class I02__String_Tersten_yazdir {


    /*
       Write a Java Program to reverse a string

     */

    public static void main(String[] args) {

        //1.Way: By using String Class

//        String str = "Java is easy";
//        String reversedStr ="";
//
//        for (int i = str.length()-1; i >-1; i--) {
//
//            reversedStr+=str.charAt(i);
//
//        }
//        System.out.println(str);
//        System.out.println(reversedStr);

        //1.Way: By using StringBuilder()

//        StringBuilder str = new StringBuilder("Java is easy");
//        str.reverse();
//        System.out.println(str);

        //or

//        StringBuilder str = new StringBuilder();
//        str.append("Java is easy");
//        System.out.println(str.reverse());

        //3.Way: Create a method then call the method from main method


        I02__String_Tersten_yazdir aa = new I02__String_Tersten_yazdir();
        aa.reversed("Java is easy");

    }

    public void reversed(String str){

        String reversed="";

        for (int i = str.length()-1; i >-1 ; i--) {

            reversed +=str.charAt(i);

        }
        System.out.println(reversed);


    }



}
