package com.glava3.Ex14;

public class Reshitov {

    public void method(String a,String b){
        if(a.equals(b)){
            System.out.println("a=b");
        }
         else if (b.equals(a)){
            System.out.println("b=a");
        }
        else if(a==b){
            System.out.println("a==b");
        }
        else if(a!=b){
            System.out.println("a!=b");
        }
        /*
        if(!a),,,,
        if(!b),,,,
        a |=b
        a^=b
        a&=b
        a = a&&b
        a = a||b
        a=~b
        a = a&b
        a = a|b
        a = a^b
        a |= b;

         */

    }
}
