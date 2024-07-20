package org.example.abstracts;

public class AtmMain {
    public static void main(String[] args) {
        Atm hdfc = new HdfcAtm();
        hdfc.withdrawAmount("ACT_1", 234.56f);
        
        Atm ICICI = new ICICIAtm();
        ICICI.withdrawAmount("ACT_2", 345.67f);
    }
}
