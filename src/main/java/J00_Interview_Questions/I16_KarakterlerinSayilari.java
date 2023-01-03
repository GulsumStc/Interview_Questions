package J00_Interview_Questions;

public class I16_KarakterlerinSayilari {


    /*

           Interview
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
           */

    public static void main(String[] args) {


        String a = "alibaba Ciftligi";

        String[] ab = a.toLowerCase().split("");

        int counter = 0;
        for (String w: ab){

            counter=0;


            for (String k: ab){

                if (w.equals(k)){

                    counter++;
                }

            }

            System.out.println(w+" harfinden "+counter+" defa mevcuttur.");


        }






    }

}
