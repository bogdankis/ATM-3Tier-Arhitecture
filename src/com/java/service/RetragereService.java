package com.java.service;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface RetragereService {
    void retragere(ContBancar contBancar) throws IncorrectPinException;
}
