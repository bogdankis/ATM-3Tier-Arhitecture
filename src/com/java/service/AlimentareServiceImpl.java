package com.java.service;


import com.java.dto.ContBancar;
import com.java.repository.AlimentareRepository;
import com.java.repository.AlimentareRepositoryImpl;
import com.java.utils.IncorrectPinException;

public class AlimentareServiceImpl implements AlimentareService{

    AlimentareRepository alimentareRepository;

    public AlimentareServiceImpl(){
        alimentareRepository = new AlimentareRepositoryImpl();
    }

    public void alimentare(ContBancar contBancar) throws IncorrectPinException {
        alimentareRepository.alimentare(contBancar);
    }
}
