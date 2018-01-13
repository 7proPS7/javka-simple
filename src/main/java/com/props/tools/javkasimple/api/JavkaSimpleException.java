package com.props.tools.javkasimple.api;

public class JavkaSimpleException extends Exception {

    public JavkaSimpleException(String message) {
        super(message);
    }

    public JavkaSimpleException(String message, Throwable reason) {
        super(message, reason);
    }
}
