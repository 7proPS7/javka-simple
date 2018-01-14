package com.props.tools.javkasimple.reflection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class MethodAnalyzerTest {
    private static final Logger log = Logger.getLogger(MethodAnalyzerTest.class.getName());
    private final String DUMMY_CLASS_NAME = "DUMMY_CLASS_NAME";
    private final String REAL_CLASS_NAME = "com.props.tools.javkasimple.reflection.Text";

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfContentNotExist() {
        new MethodAnalyzer(DUMMY_CLASS_NAME);
    }

    @Test
    public void shouldReturnedAllMethodFromClass() {
        MethodAnalyzer methodAnalyzer = new MethodAnalyzer(REAL_CLASS_NAME);
        Method[] methods = methodAnalyzer.getAllMethod();
        assertThat(methods[0].getName()).isEqualTo("write");
    }
}