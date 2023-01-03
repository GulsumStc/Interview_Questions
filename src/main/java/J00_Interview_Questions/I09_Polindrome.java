package J00_Interview_Questions;

import java.util.Scanner;

public class I09_Polindrome {
    /*
       TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

        polindrome: 12321
        ece == ece

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        String polind = scan.next();

        String tertenHali = "";

        for (int i = polind.length() - 1; i >= 0; i--) {

            tertenHali += polind.charAt(i);


            if (polind.equals(tertenHali)) {
                System.out.println("bu bir polindrome");


            } else {
                System.out.println("polindrome degil");

            } 

        }
        System.out.println(tertenHali);






    }


}
