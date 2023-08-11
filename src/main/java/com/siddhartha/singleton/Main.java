package com.siddhartha.singleton;

public class Main {

    public static void main(String[] args) {
        MyObject ob1 = MyObject.getInstance();
        MyObject ob2 = MyObject.getInstance();

        ob1.showCount();
        ob2.showCount();
    }
}
