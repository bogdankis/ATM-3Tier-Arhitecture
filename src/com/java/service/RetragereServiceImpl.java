package com.java.service;


import com.java.dto.ContBancar;
import com.java.repository.RetragereRepository;
import com.java.repository.RetragereRepositoryImpl;
import com.java.utils.IncorrectPinException;

public class RetragereServiceImpl implements RetragereService{

    RetragereRepository retragereRepository;

    public RetragereServiceImpl(){
        retragereRepository = new RetragereRepositoryImpl();
    }

    public void retragere(ContBancar contBancar) throws IncorrectPinException {
        retragereRepository.retragere(contBancar);
    }
}
