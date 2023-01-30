package J00_Interview_Questions;

public class i33_Collection_List {
/*
    Collections:


 1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
            2)Abstract Class'larda object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilamaz.
 3)Interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden
    sonra kullanilamaz.
 4)Class ==> Class ==> extends  ( class, class'ın child'ı yaparken extends kullaniriz.)
    Class ==> interface ==> implements  ( class, interface'ın child'ı yaparken implements kullaniriz.)
    interface ==> interface ==> extends  ( interface, interface'ın child'ı yaparken extends kullaniriz.)
    interface ==> Class ==> Mumkun degildir.  ( interface, Class'ın child'ı olamaz.)


//LINKEDLIST lerde eleman kelimesi yerine "NODE" denir. LinkedList bas Node manasinda "HEAD", son Node "TAIL" denir.
    Head--> Ilk elmani temsil eder. Tail--> null (son vagon) temsil eder.
    LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
    Bu da LinkedList’leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok
    yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.

 5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
    yapilacaksa ArrayList kullanmak tavsiye edilmez.
 6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkedList
    leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
    durumlarda LinkedList kullanmak tavsiye edilir.
 7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
 8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
    bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

  Note: ArrayLists'ler eleman ekleme ve eleman silme konusunda başarısızdırlar.
    Bu yüzden yapılacak application'da fazlaca eleman eklenip çıkarılacaksa ArrayList kullanılması tavsie edilmez.
    Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
    LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.

Interview:
Setler tekrarli eleman kabul etmiyor ayni elemani tekrar tekrar eklesek ne olur?

Istersen 1000 defa tekrar et Size verilen deger sonuncu deger olur java hata vermez ama sadece bir kere koyar.
oda son olandir.  java overwrite eder.


  Coklu eleman depolamak icin collectionlari kullaniriz bunun icin 6 tane opsiyonumuz var.
    Hangi opsiyonu hangi senaryoda kullnacagiz.?
    Bu kullanima gore degisir.
    Arama islemi icin ==> List
    ekle-cikar islemi icin ==> LinkedList

*/




}
