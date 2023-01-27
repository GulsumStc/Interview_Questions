package J00_Interview_Questions;

public class i32_final_finally_keyword {

    public static void main(String[] args) {

          /*
    ///Interview: final, finally, finalize keyword'lerinin farki nedir?

 1)finally{}(block) ==> try-catch block'dan sonra kullanilir.
                 Exception olsa da olmasa da calisir.
 2)final(keyword) ==>  Variable'larda final kullanilirsa, o variable'in
              degeri degistirilemez.Mesela pi sayisi final yapildigi
              zaman degeri degistirilemez final String code = "POS";

              Method'larda final kullanilirsa, method body'leri degistirilemez
              dolayisiyla overriding yapilamaz

              Class'larda final kullanilirsa, o class extend edilemez.
              Inheritance mumkun degildir.
              public final class Animal{  } ==> public class Dog extends Animal{ } OLMAZ
  3)finalize()(method) ==> finalize() methodu, Garbage Collector'in imha edecegi
                           datalari imha edilecek hale getirir.
 */


        /*
  1)Exception olsa da olmasa da calistirmamiz gereken code'lari "finally block" icine yazariz.
  2)DB ile baglantiyi kesme isini yapan code'lar gibi code'lar her halukarda calistirilmalidir, bu tarz code'lari
  "finally block" icine koyariz.
  3)"try block" yalniz kullanilamaz
  "try block" + 1 "catch block" mumkundur
  "try block" + 1 "catch block" + 1 "finally block" mumkundur
  "try block" + coklu "catch block" mumkundur
  "try block" + coklu "catch block" + 1 finally block mumkundur
  "try block" + 1 "finally block" mumkundur
4)Coklu "finally block" kullanilamaz.

*/




    }
}
