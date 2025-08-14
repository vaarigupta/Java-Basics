package com.practice.fundamental.parallelStreams;

public class Sum {

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int performSum(int value){
        return total+=value;
    }
}
