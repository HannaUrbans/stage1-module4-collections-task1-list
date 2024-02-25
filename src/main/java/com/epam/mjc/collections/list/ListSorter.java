package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());

    }

    class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {

            int firstNumber = 5 * Integer.parseInt(a) * Integer.parseInt(a) + 3;
            int secondNumber = 5 * Integer.parseInt(b) * Integer.parseInt(b) + 3;
            if (firstNumber == secondNumber) {
                return a.compareTo(b);
            }
            return Integer.compare(firstNumber, secondNumber);
        }
    }
}