package com.props.tools.javkasimple.com.props.tools.atm;

import com.props.tools.javkasimple.com.props.tools.atm.handler.*;
import com.props.tools.javkasimple.com.props.tools.atm.service.DispenseChain;

import static com.props.tools.javkasimple.com.props.tools.atm.constant.ConstantNumber.*;

public class ATMGlobalChain {
    private DispenseChain fiveHundred;

    public ATMGlobalChain() {
        this.fiveHundred = new FiveHundredHandler(FIVE_HUNDRED);
        TwoHunderZlotyHandler twoHundred = new TwoHunderZlotyHandler(TWO_HUNDRED);
        HunderZlotyHandler hundred = new HunderZlotyHandler(HUNDRED);
        FiftyZlotyHandler fifty = new FiftyZlotyHandler(FIFTY);
        TwentyZlotyHandler twenty = new TwentyZlotyHandler(TWENTY);
        TenZlotyHandler ten = new TenZlotyHandler(TEN);

        fiveHundred.setNextChain(twoHundred);
        twoHundred.setNextChain(hundred);
        hundred.setNextChain(fifty);
        fifty.setNextChain(twenty);
        twenty.setNextChain(ten);
    }

    public DispenseChain getAllChain() {
        return fiveHundred;
    }
}
