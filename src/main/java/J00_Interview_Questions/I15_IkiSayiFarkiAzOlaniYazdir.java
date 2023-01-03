package J00_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class I15_IkiSayiFarkiAzOlaniYazdir {


  /*

        Example 1: Bir tane Integer List olusturunuz.
                 Bu list'te birbirne en yakin iki tamsayiyi yaziniz.
           [12,23,9,11,35] ==> 12,11
     */


    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(23);
        num.add(9);
        num.add(11);
        num.add(10);

      // *****burda once siralamam gerek cunku buyuk kucuk sayilar arasindaki fark abana negatif verebilir bu yuzden sort kullnam gerek once
        Collections.sort(num);
            int minfark = num.get(1)-num.get(0);

            for (int i = 1; i < num.size(); i++) {

                minfark = Math.min(minfark,num.get(i)-num.get(i-1));

            }

        System.out.println(minfark);


        for (int i = 1; i < num.size(); i++) {

         int fark = num.get(i)-num.get(i-1);

         if (fark==minfark){
             System.out.println(num.get(i)+" ve "+num.get(i-1));

         }

        }










    }






}
