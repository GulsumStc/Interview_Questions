package J00_Interview_Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class i34_Collection_Set {


        /*

    Set == tekrarsiz

     HashSet<Integer> hashSet = new HashSet<>();// superFast//non-primite kullnir.
     "hash " bır teknıktır bız bu teknıgı kullanarak unique datalar uretırız.
     datalar tekrarlı olabılır ama hash kodlar tekrarlı olamaz
     1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
     2)"Set" tekrarsiz data depolamak icin kullanilan bir Collection'dir.
     3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.
     "Set" ler 3'e ayrilir;
   i)HashSet:        a) Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                     yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                     b) HashSet'ler tekrarli elemana musade etmez
                     c) HashSet'ler null i eleman olrak kabul ederler.
                     d) HashSet'ler sadece bir null'i eleman olarak kabul ederler.

  ii)LinkedHashSet:  a) LinkedHashSet elemanlari "insertion order"a gore dizer.// Bizim verdigimiz siraya gore...
                     b) LinkedHashSet elemanlari siralamak ta zaman kaybettigi icin hash sette gore yavastir.

  iii)TreeSet:       a) TreeSet elemanlari "natural order" (Kucukten buyuge veya alfabetik sira )" a gore dizer.
                     b) TreeSet natural oreder yaparken cok zaman harcar o yuzden en yavas settir.

Interview:

Setler tekrarli eleman kabul etmiyor ayni elemeani tekrar tekrar eklesek ne olur?
Istersen 1000 defa tekrar et Size verilen deger sonuncu deger olur java hata vermez ama sadece bir kere koyar.
oda son olandir.  java overwrite eder.


   /*
Interview
Madem tree set yavas buna cozum nedir?
//Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
//      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler,
//      ve sonra HashSet'i TreeSet'e ceviririz


    //Generic Method: Normal method'lar parametrelerde belirtilen data type'lari ile calisirlar.
        //                Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.


 */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(51);
        hs.add(23);
        hs.add(54);
        hs.add(21);
        hs.add(44);
        hs.add(78);
        hs.add(56);
        hs.add(9);
        hs.add(91);
        System.out.println(hs);//rasgele dizer[2, 51, 21, 54, 23, 56, 9, 91, 44, 78]

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(91);
        lhs.add(5);
        lhs.add(51);
        lhs.add(9);
        lhs.add(8);
        System.out.println(lhs);// benim verdigim sira[91, 5, 51, 9, 8]

        TreeSet<Integer> ths = new TreeSet<>();
        ths.add(23);
        ths.add(5);
        ths.add(65);
        ths.add(9);
        ths.add(91);
        System.out.println(ths);//natural order[5, 9, 23, 65, 91]


    }


}
