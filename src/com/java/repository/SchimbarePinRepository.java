package com.java.repository;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface SchimbarePinRepository {
    void schimbarePin(ContBancar contBancar) throws IncorrectPinException;
}
