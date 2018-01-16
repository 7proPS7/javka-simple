package com.props.tools.javkasimple.com.props.tools.atm.handler;

import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

public class FiftyZlotyHandler implements DispenseChain {
    @Override
    public void setNextChain(DispenseChain nextChain) {

    }

    @Override
    public void dispense(Currency currency) {
    }
}
