package com.props.tools.javkasimple.com.props.tools.atm.controller;

import com.props.tools.javkasimple.com.props.tools.atm.ATMGlobalChain;
import com.props.tools.javkasimple.com.props.tools.atm.util.Currency;

import java.util.logging.Logger;

public class ATMGlobalChainController {
    private static final Logger log = Logger.getLogger(ATMGlobalChainController.class.getName());
    private ATMGlobalChain atmGlobalChain;

    public ATMGlobalChainController(ATMGlobalChain atmGlobalChain) {
        this.atmGlobalChain = atmGlobalChain;
    }

    public void init(int quantity) {
        if (isPossibleToDispense(quantity)) {
            atmGlobalChain.getAllChain().dispense(new Currency(quantity));
        }
    }

    private boolean isPossibleToDispense(int quantity) {
        if (quantity % 10 != 0) {
            log.info("Amount should be in multiple of 10s.");
            return false;
        }
        return true;
    }

}
