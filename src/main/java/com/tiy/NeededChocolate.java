package com.tiy;

/**
 * Created by jfabiano on 9/22/2016.
 */
public class NeededChocolate {
    int numBigsNeeded;
    int numSmallsNeeded;
    int returnValue;
    public NeededChocolate()
    {

    }
    public NeededChocolate(int numBigsNeeded, int numSmallsNeeded, int returnValue)
    {
        this.numBigsNeeded = numBigsNeeded;
        this.numSmallsNeeded = numSmallsNeeded;
        this.returnValue = returnValue;
    }

    public int getNumBigsNeeded() {
        return numBigsNeeded;
    }

    public void setNumBigsNeeded(int numBigsNeeded) {
        this.numBigsNeeded = numBigsNeeded;
    }

    public int getNumSmallsNeeded() {
        return numSmallsNeeded;
    }

    public void setNumSmallsNeeded(int numSmallsNeeded) {
        this.numSmallsNeeded = numSmallsNeeded;
    }

    public int getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }
}
