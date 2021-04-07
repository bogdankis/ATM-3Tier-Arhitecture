package com.java.repository;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface AlimentareRepository {

    void alimentare(ContBancar contBancar) throws IncorrectPinException;
}
