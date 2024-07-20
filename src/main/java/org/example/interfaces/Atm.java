package org.example.interfaces;

public interface Atm {

    // these methods are called contract methods , child class must give impl
    public void withdrawAmount(String acctId, Float amt);
    public void creditAmount(String sourceAcctId, String targetAcctId, Float amt);
}
