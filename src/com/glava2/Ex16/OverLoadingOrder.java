package com.glava2.Ex16;
//import static net.mindview.util.Print.*;

/**Program in book
 * print string and value
 * @author Брюс Эккель
 *  @author  www.MindView net
 *  @version 4.0
 */
public class OverLoadingOrder {

    static void f(String s, int i){
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s){
        System.out.println("int: " + i + ", String: " + s);
    }
}/*Output:
String: сначала строка, int: 11
int: 99, String: сначала число
*///:~
