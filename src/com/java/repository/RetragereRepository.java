package com.java.repository;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface RetragereRepository{
    void retragere(ContBancar contBancar) throws IncorrectPinException;
}
