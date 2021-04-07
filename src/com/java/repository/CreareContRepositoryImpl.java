package com.java.repository;


import com.java.dto.ContBancar;

import java.util.UUID;

public class CreareContRepositoryImpl implements CreareContRepository {

    public void creareCont(ContBancar contBancar) {
        if (contBancar.getContCreat() == false) {
            contBancar.setSoldClient(0);
            contBancar.setContCreat(true);
            System.out.println("Cont creat cu succes!");
            contBancar.istoric.add("Creare cont");
            contBancar.setId(UUID.randomUUID());
            contBancar.setCodPin("0000");
            contBancar.getCodPin();
            System.out.println("Codul pin este: " + contBancar.getCodPin());
        } else if (contBancar.getContCreat() == true) {
            System.out.println("Cont deja creat. Nu se mai poate crea alt cont.");
        }
    }
}
