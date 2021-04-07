package com.java.service;


import com.java.dto.ContBancar;

public class TranzactiiServiceImpl implements TranzactiiService{
    ContBancar contBancar;

    public TranzactiiServiceImpl(){
        contBancar = new ContBancar();
    }


    public void tranzactii(ContBancar contBancar){
        contBancar.istoric.add("Tranzactii");
        contBancar.arataTranzactii();
    }
}
