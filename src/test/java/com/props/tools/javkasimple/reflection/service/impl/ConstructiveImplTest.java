package com.props.tools.javkasimple.reflection.service.impl;

import com.props.tools.javkasimple.reflection.TextAnalyzer;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class ConstructiveImplTest {
    private static final Logger log = Logger.getLogger(ConstructiveImpl.class.getName());
    private final String REAL_CLASS_NAME = "com.props.tools.javkasimple.reflection.Text";

    @Test
    public void shouldReturnedAccessTypeForConstructor() {
        TextAnalyzer analyzer = new TextAnalyzer(REAL_CLASS_NAME);
        ConstructiveImpl constr = new ConstructiveImpl();

        Constructor[] constructors = constr.getAllConstructors(analyzer.getContent());

        for (Constructor constructor : constructors) {
            log.info(String.valueOf(constr.getConstructorAccess(constructor)));
        }
    }
}