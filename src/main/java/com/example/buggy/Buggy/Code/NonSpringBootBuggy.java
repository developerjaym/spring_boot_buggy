package com.example.buggy.Buggy.Code;

import java.util.ArrayList;
import java.util.List;

public class NonSpringBootBuggy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");



        for(String s : list) {
            if(s == "a") {
                list.remove(s);
            }
        }

        System.out.println(list);
    }
}
