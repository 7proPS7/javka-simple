package com.props.tools.javkasimple.com.props.tools.atm.helper;

import java.util.logging.Logger;

public class HandlerHelper {
    private final static Logger log = Logger.getLogger(HandlerHelper.class.getName());
    private final int number;

    public HandlerHelper(final int constantNumber) {
        this.number = constantNumber;
    }

    public boolean isDispensedEnd(final int quantity) {
        if (isQuantityGreaterOrEquals(quantity)) {
            showNumberOfParts(quantity);
            return isRemainderNotEqualZero(remainder(quantity));
        }
        return false;
    }

    public int remainder(final int quantity) {
        return quantity % number;
    }

    private void showNumberOfParts(final int quantity) {
        log.info("Dispensing " + quantity / number + " " + number + " Zlotych note");
    }

    private boolean isQuantityGreaterOrEquals(final int quantity) {
        return quantity >= number;
    }

    private boolean isRemainderNotEqualZero(final int remainder) {
        return remainder != 0;
    }
}
