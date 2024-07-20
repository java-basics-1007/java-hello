package org.example.abstracts;

import java.util.UUID;

public class ICICIAtm extends AbstractAtm implements Atm {
    // alt +  insert

    public ICICIAtm(){
        txnId = "ICICI_"+UUID.randomUUID();
    }

    @Override
    public void withdrawAmount(String acctId, Float amt) {
        System.out.println("ICICI WITHDRAW from acct: "+acctId+" for amt: "+amt);
        txnComplete();
    }

    @Override
    public void creditAmount(String sourceAcctId, String targetAcctId, Float amt) {
        System.out.println("ICICI CREDIT from: "+sourceAcctId+" to: "+targetAcctId+" for amt: "+amt);
        txnComplete();
    }

}
