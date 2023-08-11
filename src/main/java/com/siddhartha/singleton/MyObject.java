package com.siddhartha.singleton;

import java.util.Objects;

/*The Singleton Pattern
* This pattern ensures that an object is instantiated only once in the application lifecycle
* Example: DB Connection Session, Hibernate Session Factory
* */
public class MyObject {

    private static MyObject myObject= null;
    private Integer count = 0;

    /*
    *Marking the default constructor as private to prevent initialisation
    *from anywhere outside the object
    */
    private MyObject(){
        this.count++;
    }

    /*
    *This method would ensure the instantiation of this object only once
    * in the application's lifecycle
    */
    public static MyObject getInstance(){
        if(Objects.isNull(myObject))
            myObject = new MyObject();
        return myObject;
    }

    public void showCount(){
        System.out.println("Count = " + this.count);
    }
}
