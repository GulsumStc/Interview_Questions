package J00_Interview_Questions;

public class I14_TestKeyWordMDA {

         /*
        Interwiew Sorusu
        Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
        //10 sorumuz var
        //ogrencilerin cevaplari
        char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Acelya
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},//Ali
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},//Yunus
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},//Erkan
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Zeynep
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Murak
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Osman
        {'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};//Mustafa
        *
        * // cevap anahtari
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        output:
        1 nolu ogrencinin dogru cevap sayisi :7
        2 nolu ogrencinin dogru cevap sayisi :6
        3 nolu ogrencinin dogru cevap sayisi :5
        4 nolu ogrencinin dogru cevap sayisi :4
        5 nolu ogrencinin dogru cevap sayisi :8
        6 nolu ogrencinin dogru cevap sayisi :7
        7 nolu ogrencinin dogru cevap sayisi :7
        8 nolu ogrencinin dogru cevap sayisi :7
     */

    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Acelya
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},//Ali
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},//Yunus
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},//Erkan
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Zeynep
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Murak
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//Osman
                {'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};//Mustafa

        // cevap anahtari
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int dogruSayisi=0;
        for (int i = 0; i<answers.length; i++){

            dogruSayisi =0;
            for (int j = 0; j <10 ; j++) {

                if (answers[i][j]==keys[j]){

                    dogruSayisi++;

                }

            }
            System.out.println((i+1)+". ogrencinin dogru sayisi: "+dogruSayisi);


        }


    }





}
