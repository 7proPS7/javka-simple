package com.props.tools.javkasimple.com.props.tools.atm.constant;

public enum ConstantNumber {
    TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500);

    private final int value;

    ConstantNumber(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
