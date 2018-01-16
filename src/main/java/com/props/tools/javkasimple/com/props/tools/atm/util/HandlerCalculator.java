package com.props.tools.javkasimple.com.props.tools.atm.util;

import java.util.logging.Logger;

public class HandlerCalculator {
    private final static Logger log = Logger.getLogger(HandlerCalculator.class.getName());

    public static int reminder(final int quantity, final int constantNumber) {
        int quotient = quantity / constantNumber;
        log.info("Dispensing " + quotient + " " + constantNumber + " Zlotych note");
        return quantity % constantNumber;
    }
}
