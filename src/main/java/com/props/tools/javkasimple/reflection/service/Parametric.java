package com.props.tools.javkasimple.reflection.service;

import com.props.tools.javkasimple.reflection.type.AccessType;
import com.props.tools.javkasimple.reflection.type.ParameterType;

import java.lang.reflect.Parameter;

public interface Parametric {
    int getNumberOfParameters();

    int getNumberOfMethodParameters();

    int getNumberOfConstructorParameters();

    ParameterType getParameterType(Parameter parameter);

    AccessType getParameterAccess(Parameter parameter);

}
