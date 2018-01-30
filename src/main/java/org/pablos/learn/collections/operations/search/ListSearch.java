package org.pablos.learn.collections.operations.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSearch {

    int getIndexOfConcreteValueUsingBinarySearch(List<Integer> values, final int concreteValue) {
        return Collections.binarySearch(values, concreteValue);
    }

    int getIndexOfConcreteValueUsingBinarySearch(int[] values, final int concreteValue) {
        return Arrays.binarySearch(values, concreteValue);
    }
}
