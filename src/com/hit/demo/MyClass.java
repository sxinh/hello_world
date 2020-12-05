package com.hit.demo;
/* created by hezixin on 2020/12/5 */

enum Color
{
    RED, GREEN, BLUE;
}
public class MyClass {
    public static void main(String[] args) {
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }
        Color myVar = Color.BLUE;

        switch(myVar) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}
