package org.example.abstracts;

public abstract class AbstractAtm {

    protected String txnId;
    public void txnComplete() {
        System.out.println("txn complete: "+ txnId);
    }

}
