package J00_Interview_Questions;

public class I10_SumOfDigits {

    //Example 3: verilen bir tam sayinin rakamlari toplamini konsola yazdiran kodu yaziniz
    // 578 ==> 5+7+8;
    //

    public static void main(String[] args) {

        int sayi = 578;

        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println(toplam);


    }
}
