package com.company;

public class Termek{
    private String nev;
    protected String kod;
    protected float egysegAr;

    public Termek(String nev, String kod, float egysegAr) throws EgysegArException {
        try {
            if(egysegAr < 0){
                throw new NegativEgysegArException(egysegAr);
            } else {
                this.nev = nev;
                this.kod = kod;
                this.egysegAr = egysegAr;
            }
        } catch (EgysegArException e) {
            throw e;
        }
    }
}
