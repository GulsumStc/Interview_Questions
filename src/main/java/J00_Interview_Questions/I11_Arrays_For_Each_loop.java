package J00_Interview_Questions;

import java.util.Arrays;

public class I11_Arrays_For_Each_loop {

    public static void main(String[] args) {


         /*
        Example 1: String bir array olusturunuz 6 tane elaman yerlerstiriniz.
        charakter sayisi 5 ten buyuk olani siliniz

         */

        String arr[] = new String[6];
        arr[0]="red";
        arr[1]="yellow";
        arr[2]="blue";
        arr[3]="green";
        arr[4]="black";
        arr[5]="pink";

        // bir array olusturmak icin
        // ilk adim data tipini tanimlamak
        // ikinci adim: kac elemanli olacagini yazmak
        // burada 5ten kucuk kac ktane var bulmamm gerek

        // burda bir dongu var for-each-loop

        int counter = 0;


        for (String w : arr) {

            if (w.length() <= 5) {
                counter++;
            }

        }
        System.out.println(Arrays.toString(arr));

        //karalter sayisi 5 ve 5 ten kucuk olani yeni array e transfer et
        String newArr[] = new String[counter];

        int index = 0;

        for (String w : arr) {


            if (w.length()<=5){

                newArr[index] = w;

               index++;
            }
        }
        System.out.println(Arrays.toString(newArr));








    }





}
