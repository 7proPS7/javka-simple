package com.props.tools.javkasimple.reflection;

import java.util.logging.Logger;

public class TextAnalyzer {
    private static final Logger log = Logger.getLogger(TextAnalyzer.class.getName());
    private Class content;

    public TextAnalyzer(String nameOfClass) {
        try {
            content = Class.forName(nameOfClass);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Class with " + nameOfClass + " argument is not found");
        }
    }

    public Class getContent() {
        return content;
    }
}
