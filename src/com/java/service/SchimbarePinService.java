package com.java.service;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface SchimbarePinService {

    void schimbarePin(ContBancar contBancar) throws IncorrectPinException;
}
