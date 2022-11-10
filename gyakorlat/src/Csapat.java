package com.company;

public class Csapat {
    private String csapatNev;
    private String csapatTagok[];
    private int osszPontszam;

    public Csapat(String csapatNev, String[] csapatTagok, int osszPontszam) {
        this.csapatNev = csapatNev;
        this.csapatTagok = csapatTagok;
        this.osszPontszam = osszPontszam;
    }

    public Csapat(String csapatNev, String[] csapatTagok) {
        this.csapatNev = csapatNev;
        this.csapatTagok = csapatTagok;
    }

    public Csapat(String csapatNev, int osszPontszam) {
        this.csapatNev = csapatNev;
        this.osszPontszam = osszPontszam;
    }

    public Csapat(String csapatNev) {
        this.csapatNev = csapatNev;
    }

    public static void zsuriz(Csapat x, int y) {
        x.setOsszPontszam(y);
    }

    public String getCsapatNev() {
        return csapatNev;
    }

    public void setCsapatNev(String csapatNev) {
        this.csapatNev = csapatNev;
    }

    public String[] getCsapatTagok() {
        return csapatTagok;
    }

    public void setCsapatTagok(String[] csapatTagok) {
        this.csapatTagok = csapatTagok;
    }

    public int getOsszPontszam() {
        return osszPontszam;
    }

    public void setOsszPontszam(int osszPontszam) {
        this.osszPontszam = osszPontszam;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
