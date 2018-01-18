package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.constant.ConstantNumber;
import com.props.tools.javkasimple.com.props.tools.atm.helper.HandlerHelper;
import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

public class FiveHundredHandler implements DispenseChain {
    private DispenseChain dispenseChain;
    private final HandlerHelper handlerHelper;

    public FiveHundredHandler(final ConstantNumber number) {
        this.handlerHelper = new HandlerHelper(number.getValue());
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (handlerHelper.isDispensedEnd(currency.getQuantity())) {
            this.dispenseChain.dispense(new Currency(handlerHelper.remainder(currency.getQuantity())));
        }
        this.dispenseChain.dispense(currency);
    }
}
