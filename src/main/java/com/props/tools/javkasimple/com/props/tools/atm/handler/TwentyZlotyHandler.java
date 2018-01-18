package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.constant.ConstantNumber;
import com.props.tools.javkasimple.com.props.tools.atm.helper.HandlerHelper;
import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

public class TwentyZlotyHandler implements DispenseChain {
    private DispenseChain dispenseChain;
    private final HandlerHelper handlerHelper;

    public TwentyZlotyHandler(final ConstantNumber number) {
        this.handlerHelper = new HandlerHelper(number.getValue());
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int quantity = currency.getQuantity();
        if (handlerHelper.isDispensedEnd(quantity)) {
            this.dispenseChain.dispense(new Currency(handlerHelper.remainder(quantity)));
        }
        this.dispenseChain.dispense(currency);
    }
}
