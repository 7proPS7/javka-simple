package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

import static com.props.tools.javkasimple.com.props.tools.atm.constant.ConstantNumber.FIFTY;
import static com.props.tools.javkasimple.com.props.tools.atm.util.HandlerCalculator.reminder;

public class FiftyZlotyHandler implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        final int quantity = currency.getQuantity();
        if (quantity >= FIFTY.getValue()) {
            int remainder = reminder(quantity, FIFTY.getValue());
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
