package com.props.tools.javkasimple.com.props.tools.atm.service;

import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
