package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();

        for (int i : sourceList) {
            int number = i * i;

            if (number >= lowerBound && number <= upperBound) {
                set.add(number);
            }
        }

        return set;
    }
}
