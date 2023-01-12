package J00_Interview_Questions;

public class i20_VariableTypes {

/*
Note:   Note:   If you do not assign any value for "static" and "non-static" variables. Java assign default variable to them
    but java does not assign default value for "local variables;
    Default value is 0 for numeric data types null is for String  and false is for boolean
    A variable which is created out of method but inside the class is called  "intance variable" it belongs the object (non-Static)
    A variable which is created out of method but inside the class  is called "Class variable"  it belogs the class (Static)

    there is no need to create a object to access static variable/class variable
    we have to create to access non-static variable/intance variable

 */

    // name is "non static"  or "object" or "intance" variaable

    public String name = "Tom hanks";

    // age is static or class varibale
    public static int age = 13;

    public static void main(String[] args) {

    }

    // local varaible
    //If you create a variable inside a method, it is called "local Variable  and it is mandatory to assign a value.
    // local variable must be initialized
    //Note: If the return type is diffrent from "void" you have to use "return" keyword inside the method

    public int add(int a, int b){

      int x= 12;// local variable
        return a+b;


    }
    public int add(int a, int b, int c){

      String s ="Java";//local variable
        return a+b*c;
    }




}
