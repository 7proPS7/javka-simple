package com.props.tools.javkasimple.reflection;

public class Text {

    public char val2;
    protected int val3;
    byte val;
    double val4;
    float val5;

    private String message;

    public Text() {
    }

    public Text(String message) {
        this.message = message;
    }

    protected Text(String message, char val2) {
        this.message = message;
        this.val2 = val2;
    }

    Text(String message, byte val) {
        this.message = message;
        this.val = val;
    }

    private Text(String message, double val4) {
        this.message = message;
        this.val4 = val4;
    }


    public String write(String message) {
        return message;
    }

    protected String read(String message) {
        return message;
    }

    private void doSomething(String message) {
    }
}
