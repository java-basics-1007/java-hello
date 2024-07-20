package org.example.methods;

public class Calculator {
    int i;
    int j;

    public Calculator(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int sum(){
        return i + j;
    }

    public int sum(int k){
        return i + j + k;
    }

    public int div(){
        return i / j;
    }
}
