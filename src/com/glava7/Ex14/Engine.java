package com.glava7.Ex14;

public class Engine {
    public void start(){}
    public void rev(){}
    public void stop(){}
    public void service() {
        System.out.println("service");
    }
}
//колесо
class Wheel{
    public void inflate(int psi){}//накачать
}
//окно
class Window{
    public void rollup (){}//поднять
    public void rolldown(){}//опустить
}

//дверь
class Door{
    public Window window = new Window(); //окно дверь
    public void open(){} //открыть
    public void close(){} //закрыть
}



