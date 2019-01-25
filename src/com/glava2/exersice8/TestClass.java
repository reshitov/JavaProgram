package com.glava2.exersice8;

public class TestClass {
    static int a =0;
    public void ex8(){
        TestClass object1 = new TestClass();
        TestClass object2 = new TestClass();
        System.out.println(object1.a+object2.a);

        object1.a+=5;

        System.out.println(object1.a+object2.a);
    }
}
