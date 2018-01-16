package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

import java.util.logging.Logger;

public class FiveHundredHandler implements DispenseChain {
    private final static Logger log = Logger.getLogger(FiftyZlotyHandler.class.getName());
    private final int FIVE_HUNDRED = 500;
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        final int quantity = currency.getQuantity();
        if (quantity >= FIVE_HUNDRED) {
            int quotient = quantity / FIVE_HUNDRED;
            int remainder = quantity % FIVE_HUNDRED;
            log.info("Dispensing " + quotient + " " + FIVE_HUNDRED + " Zlotych note");
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
