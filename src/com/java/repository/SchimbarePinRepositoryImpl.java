package com.java.repository;


import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;
import com.java.utils.ScannerWrapper;
import com.java.utils.VerificatorDePin;

public class SchimbarePinRepositoryImpl implements SchimbarePinRepository {


    public void schimbarePin(ContBancar contBancar) throws IncorrectPinException {
        while (contBancar.getIncercari() > 0) {
            VerificatorDePin verificatorDePin;
            verificatorDePin = new VerificatorDePin();
            try {
                verificatorDePin.verificarePin(contBancar);
                contBancar.istoric.add("Schimbare PIN");
                System.out.println("Introduceti noul cod pin: ");
                String introducereCodPin = ScannerWrapper.next();
                contBancar.setCodPin(introducereCodPin);
                System.out.println("codul pin este: " + contBancar.getCodPin());
            } catch (IncorrectPinException incorrectPinException) {
                System.out.println(incorrectPinException.getMessage());
            }
            break;
        }
    }
}

