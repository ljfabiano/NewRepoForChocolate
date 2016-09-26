package com.tiy;

/**
 * Created by jfabiano on 9/22/2016.
 */
import javax.persistence.*;

//@Entity//the Game class is an entity connected to the games name value in the DB
//@Table(name = "chocolate")
public class ChocolateQuestion {


    //@Column(nullable = false)//was previously false
        int smalls;

    //@Column(nullable = false)
        int bigs;

    //@Column(nullable = false)
    int chocolateInKilos;

    public int getSmalls() {
        return smalls;
    }

    public void setSmalls(int smalls) {
        this.smalls = smalls;
    }

    public int getBigs() {
        return bigs;
    }

    public void setBigs(int bigs) {
        this.bigs = bigs;
    }

    public int getChocolateInKilos() {
        return chocolateInKilos;
    }

    public void setChocolateInKilos(int chocolateInKilos) {
        this.chocolateInKilos = chocolateInKilos;
    }

    public ChocolateQuestion() {
    }

    public ChocolateQuestion(int smalls, int bigs, int chocolateInKilos) {
        this.smalls = smalls;
        this.bigs = bigs;
        this.chocolateInKilos = chocolateInKilos;

    }
}

