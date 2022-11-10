package com.company;

public class NegativEgysegArException extends EgysegArException{
    public NegativEgysegArException(float egysegAr) {
        super(egysegAr);
    }

    @Override
    public String toString() {
        return "Nem lehet negatív az egységár: " + egysegAr;
    }
}
