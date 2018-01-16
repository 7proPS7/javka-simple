package com.props.tools.javkasimple.com.props.tools.atm;

import com.props.tools.javkasimple.com.props.tools.atm.handler.*;
import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;

public class ATMGlobalChain {
    private DispenseChain fiveHundred;

    public ATMGlobalChain() {
        this.fiveHundred = new FiveHundredHandler();
        TwoHunderZlotyHandler twoHundred = new TwoHunderZlotyHandler();
        HunderZlotyHandler hundred = new HunderZlotyHandler();
        FiftyZlotyHandler fifty = new FiftyZlotyHandler();
        TwentyZlotyHandler twenty = new TwentyZlotyHandler();
        TenZlotyHandler ten = new TenZlotyHandler();

        fiveHundred.setNextChain(twoHundred);
        twoHundred.setNextChain(hundred);
        hundred.setNextChain(fifty);
        fifty.setNextChain(twenty);
        twenty.setNextChain(ten);
    }

    public DispenseChain getFiveHundred() {
        return fiveHundred;
    }
}
