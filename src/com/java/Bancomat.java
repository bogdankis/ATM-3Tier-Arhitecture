package com.java;


import com.java.controller.ComenziController;
import com.java.controller.ComenziControllerImpl;
import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;
import com.java.utils.ScannerWrapper;


public class Bancomat {


    ComenziController comenziController = new ComenziControllerImpl();
    ContBancar contBancar = new ContBancar();


    public void startBancomat() throws IncorrectPinException {
        String serviciuAles;
        while (contBancar.getBancomatFunctional(true)) {
            System.out.println("Tastati numele serviciul dorit alimentare, retragere,creare pentru creare cont, schimbare pentru schimbare pin sau stop: ");
            serviciuAles = ScannerWrapper.next();
            if (serviciuAles.toLowerCase().equals("creare")) {
                comenziController.creareCont(contBancar);
            } else if (serviciuAles.toLowerCase().equals("stop")) {
                break;
            }
            if (contBancar.getContCreat() && serviciuAles.equals("alimentare")) { // atunci cand contul este creat contCreat = true
                comenziController.alimentare(contBancar);
            } else if (contBancar.getContCreat() && serviciuAles.equals("retragere")) {
                comenziController.retragere(contBancar);
            } else if (contBancar.getContCreat() && serviciuAles.toLowerCase().equals("schimbare")) {
                comenziController.schimbarePin(contBancar);
            } else if (contBancar.getContCreat() && serviciuAles.toLowerCase().equals("istoric")) {
                comenziController.istoric(contBancar);
            } else if (contBancar.getContCreat() && serviciuAles.toLowerCase().equals("tranzactii")) {
                comenziController.tranzactii(contBancar);
            } else if (!contBancar.getContCreat()) {
                System.out.println("Cont inexistent. Creati un cont pentru a accesa celelalte servicii.");
            }
        }
    }

}


