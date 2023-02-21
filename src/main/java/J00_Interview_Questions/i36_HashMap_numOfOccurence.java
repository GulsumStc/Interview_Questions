package J00_Interview_Questions;

import java.util.HashMap;

public class i36_HashMap_numOfOccurence {

    public static void main(String[] args) {

          /*
         Type codde to print the number of occurrences of words in a senteces
         I like to move it move it you like it? I-1 like-2 to-1 move -2..........
      */
        HashMap<String,Integer> my = new HashMap<>();
        String a = "Java is money";

        //Move punctuation marks
        a= a.replaceAll("[^A-Za-z]","");
        System.out.println(a);

        //get the words by using split() method
        String[] b = a.split("");

        for (String w: b){
            Integer num = my.get(w);
            if (num==null){
                my.put(w,1);//Java do overwrite with put() method if the key is absent
            }else {
                my.replace(w,++num);
            }
        }
        System.out.println(my);




        //Example 2: type code to print the number of occurences of letter in a sentences




    }


}
