package com.hit.demo;
/* created by hezixin on 2020/12/5 */

import java.io.*;
import java.util.*;

public class BRRead {
    static void showpush(Stack<Integer> st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
    public static void main(String[] args) throws IOException {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
//        Stack<Integer> st = new Stack<Integer>();
//        System.out.println("stack: " + st);
//        showpush(st, 42);
//        showpush(st, 66);
//        showpush(st, 99);
//        showpop(st);
//        showpop(st);
//        showpop(st);
//        try {
//            showpop(st);
//        } catch (EmptyStackException e) {
//            System.out.println("empty stack");
//        }
//        char c;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');

//        try {
//            byte bWrite[] = { 11, 21, 3, 40, 5 };
//            OutputStream os = new FileOutputStream("test.txt");
//            for (int x = 0; x < bWrite.length; x++) {
//                os.write(bWrite[x]); // writes the bytes
//            }
//            os.close();
//
//            InputStream is = new FileInputStream("test.txt");
//            int size = is.available();
//
//            for (int i = 0; i < size; i++) {
//                System.out.print((char) is.read() + "  ");
//            }
//            is.close();
//        } catch (IOException e) {
//            System.out.print("Exception");
//        }
//        try {
//            int a[] = new int[2];
//            System.out.println("Access element three :" + a[1]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//        }
//        System.out.println("Out of the block");
//        BitSet bits1 = new BitSet(16);
//        BitSet bits2 = new BitSet(16);
//
//        // set some bits
//        for(int i=0; i<16; i++) {
//            if((i%2) == 0) bits1.set(i);
//            if((i%5) != 0) bits2.set(i);
//        }
//        System.out.println("Initial pattern in bits1: ");
//        System.out.println(bits1);
//        System.out.println("\nInitial pattern in bits2: ");
//        System.out.println(bits2);
//
//        // AND bits
//        bits2.and(bits1);
//        System.out.println("\nbits2 AND bits1: ");
//        System.out.println(bits2);
//
//        // OR bits
//        bits2.or(bits1);
//        System.out.println("\nbits2 OR bits1: ");
//        System.out.println(bits2);
//
//        // XOR bits
//        bits2.xor(bits1);
//        System.out.println("\nbits2 XOR bits1: ");
//        System.out.println(bits2);
//        // initial size is 3, increment is 2
//        Vector v = new Vector(3, 2);
//        System.out.println("Initial size: " + v.size());
//        System.out.println("Initial capacity: " +
//                v.capacity());
//        v.addElement(new Integer(1));
//        v.addElement(new Integer(2));
//        v.addElement(new Integer(3));
//        v.addElement(new Integer(4));
//        System.out.println("Capacity after four additions: " +
//                v.capacity());
//
//        v.addElement(new Double(5.45));
//        System.out.println("Current capacity: " +
//                v.capacity());
//        v.addElement(new Double(6.08));
//        v.addElement(new Integer(7));
//        System.out.println("Current capacity: " +
//                v.capacity());
//        v.addElement(new Float(9.4));
//        v.addElement(new Integer(10));
//        System.out.println("Current capacity: " +
//                v.capacity());
//        v.addElement(new Integer(11));
//        v.addElement(new Integer(12));
//        System.out.println("First element: " +
//                (Integer)v.firstElement());
//        System.out.println("Last element: " +
//                (Integer)v.lastElement());
//        if(v.contains(new Integer(3)))
//            System.out.println("Vector contains 3.");
//        // enumerate the elements in the vector.
//        Enumeration vEnum = v.elements();
//        System.out.println("\nElements in vector:");
//        while(vEnum.hasMoreElements())
//            System.out.print(vEnum.nextElement() + " ");
//        System.out.println();
    }
}
