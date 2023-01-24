package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : sourceList) {
            int number = i * i;
            set.add(number);
        }

        NavigableSet<Integer> result = (NavigableSet<Integer>) set.subSet(lowerBound, upperBound);

        return result;
    }
}
