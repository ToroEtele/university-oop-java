package com.company;

public class EgysegArException extends Exception{
    protected float egysegAr;

    public EgysegArException(float egysegAr) {
        super("Nem megfelelo egysegar!");
        this.egysegAr = egysegAr;
    }

    public String toString() {
        return "Nem megfelelo egysegar: " + egysegAr;
    }
}
