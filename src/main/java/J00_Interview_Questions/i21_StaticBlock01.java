package J00_Interview_Questions;


/*
          Local-Statik-NonStatic Variables:

            // name is "non static"  or "object" or "intance" variaable

            public String name = "Tom hanks";

            // age is static or class varibale

            public static int age = 13;

            int a = 13;// local variable must be initialized dont try to use a local variable out of the curly pharanthes in which variable is created.

      Note:   If you do not assign any value for "static" and "non-static" variables. Java assign default variable to them
             but java does not assign default value for "local variables;
             Default value is 0 for numeric data types null is for String  and false is for boolean



 */

public class i21_StaticBlock01 {

/*
   1-  Java class loader: make the class ready to use
       when the classes make ready, class member are loaded according to some order. Normally Main method is the fisrt to be loaed
        Java firts loads main method but sometimes you have to use something before main method. That time we use Static block
        Static blok make something ready before using main method.
        The codes inside the "static block" is executed bedore evething in the class, even before main method.
  4-  Rule:    Static structure can work just with static classes members.
               Don't put static class members into static method , it will give error.

     5- "Static block" can be used just with static variables, becasue of the rule in the 4th step.
     6- "Static block" is used to intialize (assigning fisrt value) "static variables"


     When we cerate a variable inside the main method we dont use static keyword because java knows everthing inside the main is static.

 */

    public static double pi;

    public int age = 13;

    static {//Java will execute fist this block we use it initialize static variables.
        System.out.println("this is Static Block");
        pi=3.34;
    }


    public static void main(String[] args) {

        // if i use the pi variable here it does not complain

        System.out.println("This is main method");

     //   age++;//Non-static field 'age' cannot be referenced from a static context it will complain because main method static.




    }


}
