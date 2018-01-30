package org.pablos.learn.collections.operations.search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ListSearchTest {

    private ListSearch listSearch;

    @Before
    public void setUp() {
        listSearch = new ListSearch();
    }

    @Test
    public void shouldSearchIndexOfConcreteValue() {
        int[] values = {6, 5, 9, 7};
        assertThat(listSearch.getIndexOfConcreteValueUsingBinarySearch(values, 5)).isEqualTo(1);

        List<Integer> listOfValues = Arrays.asList(1, 3, 2, 4);
        assertThat(listSearch.getIndexOfConcreteValueUsingBinarySearch(listOfValues, 2)).isEqualTo(-2);

    }
}