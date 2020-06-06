package com.resttemplate.demo.test;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> person = new ArrayList<>();
        person.add("jack");
        person.add("tom");
        person.add("cat");
        person.add("mike");
        person.add("marry");

        person.remove(3);
        System.out.println(person);

        person.remove("jack");
        System.out.println(person);

        String per = person.get(1);
        System.out.println(per);

        for (int i =0;i<person.size();i++){
            System.out.println(person.get(i));
        }

        System.out.println(person.contains("cat"));
        if(person.contains("tom")){
            System.out.println("猫");
        }else {
            System.out.println("nothing");
        }

        person.set(1,"fucking");
        System.out.println(person);

        System.out.println(person.indexOf("tom"));
        person.add("tom");
        System.out.println(person.lastIndexOf("tom"));


        if(person.indexOf("tom")==0){
            System.out.println("一只tom");
        } if(person.lastIndexOf("tom")==3){
            System.out.println("又一只tom");
        }else {
            System.out.println("找不到TOM");
        }


        List<String> phone=new ArrayList<>();
        phone.add("三星");    //索引为0
        phone.add("苹果");    //索引为1
        phone.add("锤子");    //索引为2
        phone.add("华为");    //索引为3
        phone.add("小米");    //索引为4

        System.out.println(phone);
        for (String i :phone){
            System.out.println(i);
        }

        phone = phone.subList(1,4);
        System.out.println(phone);


        List<String> p1 = new ArrayList<>();
        p1.add("qq");
        List<String> p2 = new ArrayList<>();
        p1.add("qq");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode()==p2.hashCode());
        p1.add("qq2");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode()==p2.hashCode());
    }
}
