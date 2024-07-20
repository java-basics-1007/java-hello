package org.example.abstracts;

import java.util.UUID;

public class HdfcAtm extends AbstractAtm implements Atm {
    // alt +  insert

    public HdfcAtm(){
        txnId = "HDFC_"+UUID.randomUUID();
    }
    @Override
    public void withdrawAmount(String acctId, Float amt) {
        System.out.println("HDFC WITHDRAW from acct: "+acctId+" for amt: "+amt);
        txnComplete();
    }

    @Override
    public void creditAmount(String sourceAcctId, String targetAcctId, Float amt) {
        System.out.println("HDFC CREDIT from: "+sourceAcctId+" to: "+targetAcctId+" for amt: "+amt);
        txnComplete();
    }

}
