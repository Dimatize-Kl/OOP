package com.kda.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListRunner ls = new ListRunner();
        List<String> listOne = List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        List<String> listTwo = new ArrayList(listOne);
        ls.markLength4(listTwo);


    }
}
