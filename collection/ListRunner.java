package com.kda.collection;

import java.util.List;


public class ListRunner {


    public void markLength4(List<String> str) {
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() == 4) {
                str.add(i,"****");
                i++;
            }
        }
        System.out.println(str);

    }

}




