package J00_Interview_Questions;

import java.util.Scanner;

public class i19_ForLoop_Triangle {
    // soru 6 Asagidaki sekil cizen kodu yaziniz
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         Note:     nested for loop ya diktorgen veya ucgen formatinda olabilir
                   diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
                   ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz


         */

    public static void main(String[] args) {

        //1.Yol Hocanin cozumu

        int input =6;

        for (int i = 1; i <input ; i++) { // dis loop == outer loop
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");
            }// ic loop== inner
            System.out.println("");
        }

        for (int i = 1; i <=input ; i++) { // dis loop == outer loop
            for (int j = 1; j <=input-i ; j++) {
                System.out.print("*" + " ");
            }// ic loop== inner
            System.out.println("");
        }



        //2. Yol Benim cozumum

        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }

            System.out.println();

        }


        for (int i = 1; i <= sayi; i++) {

            for (int j = i; j < sayi; j++) {

                System.out.print("*");
            }

            System.out.println();

        }


    }
}


