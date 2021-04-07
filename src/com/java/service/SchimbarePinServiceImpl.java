package com.java.service;


import com.java.dto.ContBancar;
import com.java.repository.SchimbarePinRepository;
import com.java.repository.SchimbarePinRepositoryImpl;
import com.java.utils.IncorrectPinException;

public class SchimbarePinServiceImpl implements SchimbarePinService{

    SchimbarePinRepository schimbarePinRepository;

    public SchimbarePinServiceImpl(){
        schimbarePinRepository = new SchimbarePinRepositoryImpl();
    }

    public void schimbarePin(ContBancar contBancar) throws IncorrectPinException {
        schimbarePinRepository.schimbarePin(contBancar);
    }
}
