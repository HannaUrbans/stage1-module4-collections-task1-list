package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        int sourceListSize = sourceList.size();
        for (int i = 1; i < sourceListSize; i += 3) {
            if (i + 1 < sourceListSize) {
                arrayList.add(sourceList.get(i + 1));arrayList.add(sourceList.get(i + 1));
            }
        }
        return arrayList;
    }
}

