package J00_Interview_Questions;

public class i27_Inheritance {

	// If you try to use non-existing constructor you will get  Compile Time Error

    	/*
    1- Child class = sub class <==> Parent class = super class
    2-  To call parent constructors we use super()
   	3- When you use super() keyword Java looks for the  constructor from parent not from grand-parent
	    or grand-grand-parent...
	4-  But it is not mandatory, typing super() or not typing super() is same. It is optional

    5 - If you use super() inside a constructor, it must be in the first line otherwise you will get Compile Time Error
	*//*
	 public and protected variables or methods can be
	 inherited without any issue.
	 Static variables and methods cannot be inherited

	 From child(sub) class to parent(super) class Java calls "IS-A" relationship
	 From parent(super) class to child(sub) class Java calls "HAS-A" relationship
	*/

    /*
    Inheritance Faydalari;

        1-Code standardında tekrar iyi değildir.
        2-Code değişime açık olmalıdır. Hatayı düzeltmek kolay olmalı.
        3-Gelişime açık olmalıdır
        4-Code  atomic yapıda olmalı.
      Note:
       1- Parent class(super class)(ortak ozellikleri icerir)(-child class(sub class)(Class'a ozel ozellikleri icerir)

       2- Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız.

       3- "public" metholar "child class'lar tarafindan kullnilabilir.
         "child class'lar tarafindan kullnilabilir demek "inherit edilebilir" demek.

       4- "protected methodlar inherit edilebilir.Cunku protected olan method ve variable'lar tarafindan kullnilir.

       5- "default method'lar object ile ayni package'de olduklari surece "inherit edilebilir.
          Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler

       6- Private methodlar "inherit edilemezler", ozel olana ulasamayiz.

       7- Java birden fazla parant i onaylamaz.

       8: Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.

       9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.

       10- Java da object class haric tum classlarin parenti vardi.
           Java da paranti olmayan tek class "object Classtir.

       Note 11:
     HAS-A relationship:   "parent" tan "child" a ola iliskilere denir.
     IS-A relationship:   "child" tan  "parent" a olan ilskilere denir.

     12: Javada her class in bir tane default constructor'u vardir. Bu default constructur Class in icinde gorunmez
         Cunku default constructor Object class icindedir.
         Bizim classimiz default constructora ihtiyac duydunda parant olan Object class'a gider. ve aradaki constructor'i kullanir

 */



}
