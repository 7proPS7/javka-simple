package com.props.tools.javkasimple.reflection;

public class TextLoader {
    public static Class loadClass(String nameOfClass) throws ClassNotFoundException {
        return Class.forName(nameOfClass);
    }
}
