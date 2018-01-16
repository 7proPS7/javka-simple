package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

import java.util.logging.Logger;

public class HunderZlotyHandler implements DispenseChain {
    private final static Logger log = Logger.getLogger(FiftyZlotyHandler.class.getName());
    private final int HUNDRED = 100;
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        final int quantity = currency.getQuantity();
        if (quantity >= HUNDRED) {
            int quotient = quantity / HUNDRED;
            int remainder = quantity % HUNDRED;
            log.info("Dispensing " + quotient + " " + HUNDRED + " Zlotych note");
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
