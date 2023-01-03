package J00_Interview_Questions;

import java.util.Scanner;

public class I06_Constructor {

     /*
             ============What is constractor????????????? ================

      int class you have methods and variable so ====>  object will have method and variable as well


      constractera are used to create object from a class

      if a class does not have constracter you ara not able to create a objact
      it a mandatory to create an abject from a class





     */

    public static void main(String[] args) {

        /*

        Java knows classes are tamplates to create object.
        Because of that Java puts constracter in every class as default.
        Default constracter are invisible inside the classes
        when you create a class java will give you constarcter automatically
        Dfault constructor have no any parameter inside the paranthesis

        Constructor names must be same with the class names


         */
        //  ======= created an object======

        Scanner scan = new Scanner(System.in);
        // class name    - name of object   =  keyword     Constructor
        I06_Constructor obj1 = new I06_Constructor();// that code is for creating an object


        //  Class name match contructor name

    }
}