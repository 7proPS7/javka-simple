package com.props.tools.javkasimple.reflection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class TextAnalyzerTest {

    private static final Logger log = Logger.getLogger(TextAnalyzerTest.class.getName());
    private final String DUMMY_CLASS_NAME = "DUMMY_CLASS_NAME";
    private final String REAL_CLASS_NAME = "com.props.tools.javkasimple.reflection.Text";

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfContentNotExist() {
        new TextAnalyzer(DUMMY_CLASS_NAME);
    }

    @Test
    public void shouldReturnedNumberOfConstructors() {
        TextAnalyzer textAnalyzer = new TextAnalyzer(REAL_CLASS_NAME);
        int constructorsCount = textAnalyzer.getNumberOfConstructors();
        assertThat(constructorsCount).isEqualTo(2);
    }
}