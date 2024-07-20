package org.example.interfaces;

import java.util.UUID;

public class HdfcAtm implements Atm{
    // alt +  insert

    public String txnId;

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

    public void txnComplete() {
        System.out.println("txn complete: "+ txnId);
    }
}
