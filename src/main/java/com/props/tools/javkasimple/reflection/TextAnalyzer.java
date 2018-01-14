package com.props.tools.javkasimple.reflection;

import java.util.logging.Logger;

public class TextAnalyzer {
    private static final Logger log = Logger.getLogger(TextAnalyzer.class.getName());
    private static Class content;

    TextAnalyzer(String nameOfClass) {
        try {
            content = Class.forName(nameOfClass);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Class with " + nameOfClass + " argument is not found");
        }
    }
}
