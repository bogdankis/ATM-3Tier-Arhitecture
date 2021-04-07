package com.java.repository;


import com.java.dto.ContBancar;

public class IstoricRepositoryImpl implements IstoricRepository {

    public void istoric(ContBancar contBancar) {
        contBancar.istoric.add("Istoric");
        System.out.println("Istoricul ultimelor operatiuni: " + contBancar.istoric);
    }
}
