package com.java.service;


import com.java.dto.ContBancar;
import com.java.repository.IstoricRepository;
import com.java.repository.IstoricRepositoryImpl;

public class IstoricServiceImpl implements IstoricService {
    IstoricRepository istoricRepository;

    public IstoricServiceImpl(){
        istoricRepository = new IstoricRepositoryImpl();
    }

    public void istoric(ContBancar contBancar){
        istoricRepository.istoric(contBancar);
    }
}
