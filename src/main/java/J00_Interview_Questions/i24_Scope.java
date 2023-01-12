package J00_Interview_Questions;

public class i24_Scope {
    int num1 = 12;
    double dbl;

    public static void main(String[] args) {
		/*
		 Scope means where to use variables
		 1)If you create a variable inside the class body and outside the methods
		   you can use them in everywhere inside the class.
		   Note: The variables created inside the class body and outside the
		         methods are called "Instance Variables".
		         num1 is an instance variable, num1 can be used from every where
		         inside the class.
		 2)If you create a variable inside a method you can use it just inside
		   that method. Inside the other methods, it cannot be used
		   Note: The variables created inside a method are called "Local Variables"
		         "ch" is a local variable

		 Question: What is the difference between "Instance Variable" and
		           "Local Variable"?
		           ==> Local variables must be initialized(Assigning a value)
		               but if you want you may not initialize instance variables.
		 3)If you create a variable inside the method parentheses it is called
		   local variable as well and you can use it just inside the method body.
		   i and j can be used just inside the subtract() method body
		 4)Do not try to use a variable before declaration
		*/
    }

    public void add() {
        num1++;
        System.out.println(dbl);//0.0
        char ch = 'a';
        int num2;
        //System.out.println(num2);//If you do not assign any value for a
        //local variable, Java does not assign default value
        //because of that you will get Compile Time Error
        //when you want to use it.
    }

    public void subtract(int i, int j) {
        num1 = num1 - 4;
        // ch = 'm'; ==> You cannot use ch over here because you created it
        //               inside the add() method
    }

    public void product() {
        //x = x * 5;
        //int x = 12;
        //You tried to use x variable before declaration. It gives Compile
        //Time Error. To fix that problem you need to declare first
    }
}
