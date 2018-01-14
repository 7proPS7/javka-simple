package com.props.tools.javkasimple.reflection;

import java.lang.reflect.Method;

public class MethodAnalyzer {
    private static Class content;

    MethodAnalyzer(String nameOfClass) {
        try {
            content = TextLoader.loadClass(nameOfClass);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Class with " + nameOfClass + " argument is not found");
        }
    }

    public Method[] getAllMethod() {
        return content.getMethods();
    }

}
