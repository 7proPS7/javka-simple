package com.props.tools.javkasimple.com.props.tools.atm.demo;

import com.props.tools.javkasimple.com.props.tools.atm.ATMGlobalChain;
import com.props.tools.javkasimple.com.props.tools.atm.controller.ATMGlobalChainController;

import java.util.logging.Logger;

public class ATMDemo {
    private static final Logger log = Logger.getLogger(ATMDemo.class.getName());

    public static void main(String[] args) {
        ATMGlobalChain globalChain = new ATMGlobalChain();
        ATMGlobalChainController controller = new ATMGlobalChainController(globalChain);

        controller.init(540);
        log.info("===============================");
        controller.init(5);
        log.info("===============================");
        controller.init(10);
        log.info("===============================");
        controller.init(5322);
        log.info("===============================");
        controller.init(50000);
        log.info("===============================");
        controller.init(20);
        log.info("===============================");
        controller.init(100);
        log.info("===============================");
    }
}