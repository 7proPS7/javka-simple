package org.pablos.learn.collections.operations.sort;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ListSortsTest {

    private ListSorts listSorts;

    @Before
    public void setUp() {
        listSorts = new ListSorts();
    }

    @Test
    public void shouldSortValue() {
        int[] nonSortedArray = {6, 5, 9, 7};
        int[] sortedArray = {5, 6, 7, 9};
        listSorts.sortArray(nonSortedArray);
        assertThat(nonSortedArray).isEqualTo(sortedArray);
    }
}