package com.java.controller;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;

public interface ComenziController {

    void creareCont(ContBancar contBancar);

    void alimentare(ContBancar contBancar) throws IncorrectPinException;

    void retragere(ContBancar contBancar) throws IncorrectPinException;

    void schimbarePin(ContBancar contBancar) throws IncorrectPinException;

    void istoric(ContBancar contBancar);

    void tranzactii(ContBancar contBancar);


}
