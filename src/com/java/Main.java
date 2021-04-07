package com.java;

import com.java.utils.IncorrectPinException;

public class Main {

    public static void main(String[] args) throws IncorrectPinException {
        Bancomat banca = new Bancomat();
        banca.startBancomat();
    }
}
