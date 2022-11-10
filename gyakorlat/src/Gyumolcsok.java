package com.company;

public class Gyumolcsok extends Termek implements Akciozhato{

    public Gyumolcsok(String nev, String kod, float egysegAr) throws EgysegArException {
        super(nev, kod, egysegAr);
    }

    public float akciosAr(int kedvezmeny) {
        return egysegAr/100*kedvezmeny;
    }
}
