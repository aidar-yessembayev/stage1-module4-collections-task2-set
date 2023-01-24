package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : sourceList) {

            if (i % 2 == 0) {

                int k = i;
                while (k % 2 == 0) {
                    set.add(k);
                    k = k/2;
                }
                set.add(k);

            } else {
                set.add(i);
                set.add(i*2);
            }

        }

        return set;
    }
}
