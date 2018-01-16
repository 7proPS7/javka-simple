package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;
import com.props.tools.javkasimple.com.props.tools.atm.util.HandlerCalculator;

import static com.props.tools.javkasimple.com.props.tools.atm.constant.ConstantNumber.FIFTY;

public class FiftyZlotyHandler implements DispenseChain {
    private DispenseChain dispenseChain;
    private HandlerCalculator handlerCalculator;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        final int quantity = currency.getQuantity();
        handlerCalculator = new HandlerCalculator(quantity, FIFTY.getValue());
        if (handlerCalculator.isQuantityGreaterOrEquals()) {
            handlerCalculator.showDispensingMessage();

            int remainder = handlerCalculator.remainder();
            if (remainder != 0)
                this.dispenseChain.dispense(new Currency(remainder));
        }
        this.dispenseChain.dispense(currency);
    }
}
