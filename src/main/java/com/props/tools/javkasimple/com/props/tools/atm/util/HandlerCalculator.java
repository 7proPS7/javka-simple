package com.props.tools.javkasimple.com.props.tools.atm.util;

import java.util.logging.Logger;

public class HandlerCalculator {
    private final static Logger log = Logger.getLogger(HandlerCalculator.class.getName());
    private int quantity;
    private int constantNumber;

    public HandlerCalculator(int quantity, int constantNumber) {
        this.quantity = quantity;
        this.constantNumber = constantNumber;
    }

    public int remainder() {
        return quantity % constantNumber;
    }

    public void showDispensingMessage() {
        int quotient = quantity / constantNumber;
        log.info("Dispensing " + quotient + " " + constantNumber + " Zlotych note");
    }

    public boolean isQuantityGreaterOrEquals() {
        return quantity >= constantNumber;
    }
}
