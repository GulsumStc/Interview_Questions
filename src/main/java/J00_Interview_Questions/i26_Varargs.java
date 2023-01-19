package J00_Interview_Questions;

public class i26_Varargs {

    	/*
		 Sometimes we need flexible number of parameters
		 If you use varargs as a parameter in a method, you method runs for
		 every number of arguments
		 To create a varargs use "..." after the data type. The syntax is like "int... x"
		 Varargs is actually an array because of that in varargs we use Array methods
		 Varargs is like a bottomless pit, you can put infinitely many number of elements
		 into it, there is no any limit.
		 If you want to not put any element into a varargs, it is fine because empty
		 array is fine

		 Rule 1: If you use varargs in a method it must be the last parameter.
		         If you use varargs at the beginning or in the middle you will get
		         Compile Time Error
		 Rule 2: If you use more than 1 varargs in a methdo as a parameter you will
		         get Compile Time Error.
		*/

    /*
	 Create a method
	 The method will accept the characters and return the characters after joining
	 The method should run for every number of characters
	 For example; a, l, i ==> ali
	*/
    public static void join(char... c) {
        for(char w : c) {
            System.out.print(w);
        }
        System.out.println();
    }


    /*

         Varargs: Variable Argument ==> Farkli bir yapidir ama List degil Array degil Arka planda arrayi kullanilir.
         int... seklinde yazilir.  2 parametre icinde 100 parametre icinde calisir.

         Bir method ta birden fazla varags parametre kullanilamaz. cunku ikinci " Unreacable Code" olur

         Note: Varargs disindaki parametrelerle kullanilabilir. AMA: (String s, int... a) varargs en sagda olmalidir.

         Note: tum primitiveler ile birlikte calisir.
               Non-Primitivelerle de calisir. ama non-primitive in kendisini degil referece'sini kullanir.


     */

    public static void main(String[] args) {



        join('a','l','i');


        countNum(5);
        countNum(5,7,9);
        countNum(5,7,9,11,13,15,17,19,21);

        sumNums(2,3);
        sumNums(2,3,4,5);
        sumNums(2,3,4.5,5,6,7,8,9);

        printName("Ali");
        printName("Ali", "Kahraman");
        printName("Ali", "Can", "Kahraman");
    }


    public static void countNum(int... a) {

        System.out.println(a.length);
    }

    public static void sumNums(double... b) {
        double sum=0;
        for(double w: b) {
            sum = sum + w;
        }
        System.out.println(sum);
    }

    public static void printName(String... n) {
        for(String w: n) {
            System.out.print(w + " ");
        }
    }



}
