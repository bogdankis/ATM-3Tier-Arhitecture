package com.java.dto;



import com.java.repository.Tranzactii;

import java.util.*;

public class ContBancar {
    public Map<UUID, Tranzactii> tranzactieHarta = new HashMap<>();
    public List<String> istoric = new ArrayList<>();


    private String codPin;
    private UUID id;
    private boolean contCreat;
    boolean bancomatFunctional = true;

    private float soldClient;
    private float soldDupa;
    private int incercari = 3;
    private int index = 0;

    public String getCodPin() {
        return codPin;
    }

    public void setCodPin(String codPin) {
        this.codPin = codPin;
    }

    public UUID getId(UUID getId) {
        return getId;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getSoldClient(float soldClient) {
        return soldClient;
    }

    public void setSoldClient(float soldClient) {
        this.soldClient = soldClient;
    }

    public boolean getContCreat() {
        return contCreat;
    }

    public void setContCreat(boolean contCreat) {
        this.contCreat = contCreat;
    }

    public boolean getBancomatFunctional(boolean bancomatFunctional) {
        return bancomatFunctional;
    }

    public float getSoldClient() {
        return soldClient;
    }

    public float getSoldDupa() {
        return soldDupa;
    }

    public void setSoldDupa(float soldDupa) {
        this.soldDupa = soldDupa;
    }


    public int getIncercari() {
        return incercari;
    }



    public void setIncercari(int incercari) {
        this.incercari = incercari;
    }

    public int getIndex() {
        return index;
    }

    public void arataTranzactii() {
        for (Map.Entry<UUID, Tranzactii> en : tranzactieHarta.entrySet()) { // o sa afiseze toate tranzactiile pe care le-a facut clientul

            System.out.print("UUID: ");
            System.out.print(en.getKey());
            System.out.print(en.getValue());
            System.out.print("\n");
        }

    }
}
