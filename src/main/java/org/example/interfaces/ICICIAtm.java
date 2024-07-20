package org.example.interfaces;

import java.util.UUID;

public class ICICIAtm implements Atm{
    // alt +  insert


    public String txnId;

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

    public void txnComplete()
    {
        System.out.println("txn complete: "+ txnId);
    }
}
