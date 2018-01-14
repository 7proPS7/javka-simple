package com.props.tools.javkasimple.reflection.service.impl;

import com.props.tools.javkasimple.reflection.service.Parametric;
import com.props.tools.javkasimple.reflection.type.AccessType;
import com.props.tools.javkasimple.reflection.type.ParameterType;

import java.lang.reflect.Parameter;

public class ParametricImpl implements Parametric {
    @Override
    public int getNumberOfParameters() {
        return 0;
    }

    @Override
    public int getNumberOfMethodParameters() {
        return 0;
    }

    @Override
    public int getNumberOfConstructorParameters() {
        return 0;
    }

    @Override
    public ParameterType getParameterType(Parameter parameter) {
        return null;
    }

    @Override
    public AccessType getParameterAccess(Parameter parameter) {
        return null;
    }
}
