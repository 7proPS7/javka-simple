package org.pablos.learn.collections.convert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ConverterBetweenArraysTest {

    private final String[] arrayOfNames = {"Pawel", "Adam", "Tomek", "Krzysiek", "Artur", "Bartek"};
    private final List<String> listOfNames = Arrays.asList("Pawel", "Adam", "Tomek", "Krzysiek", "Artur", "Bartek");

    private ConverterBetweenArrays converter;

    @Before
    public void setUp() {
        converter = new ConverterBetweenArrays();
    }

    @Test
    public void shouldReturnedArrayFromArrayList() {
        assertThat(converter.convertArrayListToArray(listOfNames)).isEqualTo(arrayOfNames);
    }

    @Test
    public void shouldReturnedListFromArray() {
        assertThat(converter.convertArrayToArrayList(arrayOfNames)).isEqualTo(listOfNames);
    }
}
