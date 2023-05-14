package com.driver;

public class Main {

    public static void main(String args[])
    {
        RWOnly obj = new RWOnly();
        //setter
        obj.setName("Shraddha Singh");
        //getter
        System.out.println(obj.getName());
        //obj.name = "Shraddha";
        //System.out.println(obj.name);
        //name has private access in 'com.driver.RWOnly'

    }
}