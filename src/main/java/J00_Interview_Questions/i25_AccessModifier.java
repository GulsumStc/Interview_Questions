package J00_Interview_Questions;

public class i25_AccessModifier {

    /*

    Public: It is accessible from entire the project, there is no restriction

    Private: It can be used just inside the class it was created.

    (Default): if you don't type any  access modifier it will be "default"
               it can be just used inside the package that it was created
               If you go outside of package you are not able to see it.
               it is called "package private" as well.


    Protected: it can be used inside the package and child classes in other package.
               it is visible parent-child. if the child of this class is in the nother package it is visible fot it.

    ***Note: A class can not be "private"!!!!  you can not make class private
             A class cont not be "protected"  Classes can not be declared as protected
             When you create a class you have two options one of them is public and another one is default

    Following ones are "static" to access static things, do not use "object", use class name

    */

    /*
    Interview Question:

  1)  What is the differences  between "default" and "protected" access modifier?

    - "protected" access modifier is wider than "default" modifier
    - "default" ones can not be used from outside the package, therefore its another name is "package private"
       "protected" ones can be used from the class in the other packages if the clasess are "child classes".

   2) Could you please tell me the name of the access modifiers  from the narrowest to the widest?

      - private--> just for claas
      - Default--> just for package
      - protected--> just for package which it is created and  childs of the class in another package  (parent-child)
      - puplic--> no restriction

    3) Could you please explain all access modifier?
       .....


     */

       /*
                1)Access modifier'lar genis'den dara; public > protected > default > private
                2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
                3)Access Modifier'lar ne ise yarar?
                        Variablelara methodlara classlara ulasmayi duzenler.
                4)Kac tane access modifier var ?
                        public > protected > default > private
                        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
                        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
                        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
                        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
                        v) "protected" ile "default"un farki nedir ?
                           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
         */



}
