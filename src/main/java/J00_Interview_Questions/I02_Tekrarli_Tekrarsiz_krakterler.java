package J00_Interview_Questions;

public class I02_Tekrarli_Tekrarsiz_krakterler {
    public static void main(String[] args) {
        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //               "abbccdd" ==> b-> tekrarsiz a-> tekrarsiz  seklinde

        // 1. Cozum yolu
        String str = "abccbdd";

        boolean fistChar = str.indexOf('a') == str.lastIndexOf('a');
        boolean secondChar = str.indexOf('b') == str.lastIndexOf('b');
        boolean thirdChar = str.indexOf('c') == str.lastIndexOf('c');

        System.out.println("a tekrarli mi: " + fistChar);
        System.out.println("b tekrarli mi: " + secondChar);
        System.out.println("c tekrarli mi: " + thirdChar);

        //2. Cozum Yolu
        // kullnici her ne girerse girsin ilk uc karakterinin tekrarli olup olmadigini sorguluyoruz

        char firstCh = str.charAt(0);
        char secondCh = str.charAt(1);
        char thirdCh = str.charAt(2);
        boolean firstch1 = str.indexOf(firstCh)==str.lastIndexOf(firstCh);
        boolean secondch1 = str.indexOf(secondCh)==str.lastIndexOf(secondCh);
        boolean thirdch1 = str.indexOf(thirdCh)==str.lastIndexOf(thirdCh);

        if (firstch1){
            System.out.println("ilk karakter: "+firstCh+" tekrarsiz");
        }else {
            System.out.println("ilk karakter: "+firstCh+" tekrarli");
        }

        if (secondch1){
            System.out.println("ikinci karakter: "+secondCh+" tekrarsiz");
        }else {
            System.out.println("ikinci karakter: "+secondCh+" tekrarli");
        }

        if (thirdch1){
            System.out.println("ucuncu karakter: "+thirdCh+" tekrarsiz");
        }else {
            System.out.println("ucuncu karakter: "+thirdCh+" tekrarli");
        }









    }
}
