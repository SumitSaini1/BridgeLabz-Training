package com.example.junit_demo;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List Cannot be null");
        }
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List Cannot be null");
        }
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List Cannot be null");
        }
        return list.size();
    }
}
