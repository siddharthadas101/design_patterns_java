package com.siddhartha.singleton;

/*
* @author Siddhartha Das
*/
public class Main {

    // Here we will test out the Singleton Object by getting 2 instances of it
    public static void main(String[] args) {
         /* since we have marked the default constructor as private
          * we will not be able to use it to instantiate an object
          * so we use the static getInstance() method
         */
        MyObject ob1 = MyObject.getInstance();
        MyObject ob2 = MyObject.getInstance();

        ob1.showCount();
        ob2.showCount();

        /* To verify whether both objects are referring to the same instance,
         * print the objects to get the hexadecimal hashCodes in the output
         * if the hashCodes are the same for both objects, it means they are same
         */
        System.out.println("ob1 = " + ob1 + "\nob2 = " + ob2);

        //let's try by comparing them for equality
        System.out.println("Is Ob1 same as Ob2? :: "+ (ob1.equals(ob2)?"YES":"NO"));
    }
}
