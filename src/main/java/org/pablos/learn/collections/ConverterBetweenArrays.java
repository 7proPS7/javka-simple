package org.pablos.learn.collections;

import java.util.Arrays;
import java.util.List;

public class ConverterBetweenArrays {

    String[] convertArrayListToArray(List<String> names) {
        return (String[]) names.toArray();
    }

    List<String> convertArrayToArrayList(String[] names) {
        return Arrays.asList(names);
    }
}
