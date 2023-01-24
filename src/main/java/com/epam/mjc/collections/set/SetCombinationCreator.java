package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        for (String i : thirdSet) {
            if (!(firstSet.contains(i) && secondSet.contains(i))) {
                result.add(i);
            }
        }

        for (String i : firstSet) {
            if (secondSet.contains(i) && !(thirdSet.contains(i))) {
                result.add(i);
            }
        }

        for (String i : secondSet) {
            if (firstSet.contains(i) && !(thirdSet.contains(i))) {
                result.add(i);
            }
        }

        return result;
    }
}
