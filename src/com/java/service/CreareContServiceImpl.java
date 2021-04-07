package com.java.service;


import com.java.dto.ContBancar;
import com.java.repository.CreareContRepository;
import com.java.repository.CreareContRepositoryImpl;

public class CreareContServiceImpl implements CreareContService {

    CreareContRepository creareContRepository;

    public CreareContServiceImpl() {
        creareContRepository = new CreareContRepositoryImpl();
    }


    public void creareCont(ContBancar contBancar) {
        creareContRepository.creareCont(contBancar);
    }
}
