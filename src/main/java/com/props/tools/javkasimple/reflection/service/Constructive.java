package com.props.tools.javkasimple.reflection.service;

import com.props.tools.javkasimple.reflection.type.AccessType;

import java.lang.reflect.Constructor;

public interface Constructive {
    int getNumberOfConstructors(Class content);

    Constructor[] getAllConstructors(Class content);

    AccessType getConstructorAccess(Constructor constructor);
}
