package org.example.duplicates;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicates {
    /*
    Diferenta dintre Arrays.asList() vs new ArrayList<>(Arrays.asList());
     */
    public static void main(String[] args) {}

    public static String [] removeDuplicates(String[] input){
        Set<String> set = new LinkedHashSet<>(Arrays.asList(input));
        return set.toArray(new String[0]);

    }
}
