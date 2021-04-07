package com.java.service;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface AlimentareService {
    void alimentare(ContBancar contBancar) throws IncorrectPinException;
}
