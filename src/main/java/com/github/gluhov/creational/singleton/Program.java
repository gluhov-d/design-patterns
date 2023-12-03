package com.github.gluhov.creational.singleton;

public class Program {
    public static void main(String[] args) {
        Cache.getInstance().setData("First", "first data");
        Cache.getInstance().setData("Second", "second data");
        Cache.getInstance().setData("Third", "third data");
        System.out.println(Cache.getInstance().getData("Third"));
        System.out.println(Cache.getInstance().getData("Second"));
        System.out.println(Cache.getInstance().getData("First"));
        Cache.getInstance().setData("First", "another first data");
        System.out.println(Cache.getInstance().getData("First"));
        Cache.getInstance().removeData("First");
        System.out.println(Cache.getInstance().getData("First"));
    }
}
