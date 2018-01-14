package com.props.tools.javkasimple.reflection.service.impl;

import com.props.tools.javkasimple.reflection.service.Constructive;
import com.props.tools.javkasimple.reflection.type.AccessType;

import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class ConstructiveImpl implements Constructive {
    private static final Logger log = Logger.getLogger(ConstructiveImpl.class.getName());

    @Override
    public int getNumberOfConstructors(Class content) {
        int value = content.getConstructors().length;
        log.info(String.valueOf(value) + " constructors expected");
        return value;
    }

    @Override
    public Constructor[] getAllConstructors(Class content) {
        return content.getConstructors();
    }

    @Override
    public AccessType getConstructorAccess(Constructor constructor) {
        return null;
    }
}
