package J00_Interview_Questions;

public class I01_SwapValues_Interview {
    public static void main(String[] args) {

        // Swap: Yer degistirmek.
        // 1.kap: Patates 2.Kap: Domates ==> Swap==> 1. kap: Domates 2.Kap:Patates

        // verilen iki sayi birbirleriyle yer degistiriniz...


        int a = 12;
        int b = 5;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // istenilen: a-->5    b-->12

        //1.Yol
        int temp = 0;

        temp = a; // temp = 12
        a = b; // a=5
        b = temp; //b=12
        System.out.println("degisimden sonra a: " + a);
        System.out.println("degisimden sonra b: " + b);

        //2. Yol genelde bu yol istenir. ucuncu vir varaible kullnilmasi istenmez

        a = a + b; //17
        b = a - b; //12
        a = a - b; //5

        System.out.println("degisimden sonra a: " + a);
        System.out.println("degisimden sonra b: " + b);


    }


}
