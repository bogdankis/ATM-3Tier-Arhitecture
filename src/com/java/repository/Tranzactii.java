package com.java.repository;


import com.java.dto.ContBancar;

public class Tranzactii{

    private float soldClient;
    private float soldDupa;
    private float soldDiferenta;
    private boolean stareTranzactie;
    private String tipTranzactie;

    public void tranzactii(ContBancar contBancar) {
    }



    public Tranzactii(float soldClient, float soldDupa, float soldDiferenta, boolean stareTranzactie, String tipTranzactie){
        this.soldClient = soldClient;
        this.soldDupa = soldDupa;
        this.soldDiferenta = soldDiferenta;
        this.stareTranzactie = stareTranzactie;
        this.tipTranzactie = tipTranzactie;
        }

    @Override
    public String toString() {
        return "Tranzactii{" +
                "soldInainte=" + soldClient +
                ", soldDupa=" + soldDupa +
                ", soldDiferenta=" + soldDiferenta +
                ", stareTranzactie=" + stareTranzactie +
                ", tipTranzactie=" + tipTranzactie +
                '}';
    }


}
