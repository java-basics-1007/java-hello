package org.example.methods;

public class ScientificCalculator extends Calculator{


    // how u can call parent class constructor from child class
    public ScientificCalculator(int i, int j){
        super(i, j);
    }
    @Override
    public int div() {
        if(j == 0){
            return 0;
        }
        return super.div();
    }
}
