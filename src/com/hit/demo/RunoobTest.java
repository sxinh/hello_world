package com.hit.demo;
/* created by hezixin on 2020/12/5 */

import java.util.*;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建一个HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // 访问 HashMap 中的每一个映射项
        System.out.print("Entries: ");

        // entrySet()返回了 HashMap 中所有映射项的一个 set 集合视图
        // for-each loop 在该视图中访问了每一映射项
        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(", ");
        }
//        // 创建 HashMap 对象 Sites
//        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
//        // 添加键值对
//        Sites.put(1, "Google");
//        Sites.put(2, "Runoob");
//        Sites.put(3, "Taobao");
//        Sites.put(4, "Zhihu");
//        System.out.println(Sites);
//        LinkedList<String> sites = new LinkedList<String>();
//        sites.add("Google");
//        sites.add("Runoob");
//        sites.add("Taobao");
//        sites.add("Weibo");
//        System.out.println(sites);
//        ArrayList<String> sites = new ArrayList<String>();
//        sites.add("Google");
//        sites.add("Runoob");
//        sites.add("Taobao");
//        sites.add("Weibo");
//        System.out.println(sites);
//        System.out.println(sites.get(1));  // 访问第二个元素
//        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
//        System.out.println(sites);
//        sites.remove(3); // 删除第四个元素
//        System.out.println(sites);
//        System.out.println(sites.size());
//        for (int i = 0; i < sites.size(); i++) {
//            System.out.println(sites.get(i));
//        }
//        for (String i : sites) {
//            System.out.println(i);
//        }
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//        Collections.sort(sites);  // 字母排序
//        for (String i : sites) {
//            System.out.println(i);
//        }
//        Collections.sort(myNumbers);  // 数字排序
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
    }
}
