package com.java.utils;


import com.java.dto.ContBancar;

public class VerificatorDePin {
    boolean checkPin = false;

    private void introducereCodPin(ContBancar contBancar) {

        System.out.println("Introduceti codul pin: ");
        String introducereCodPin = ScannerWrapper.next();
        if (introducereCodPin.equals(contBancar.getCodPin())) { //daca codul pin e corect  i se atribuie o valoare pentru a iesi din bucla
            checkPin = true;

        } else {
            contBancar.setIncercari(contBancar.getIncercari() - 1);
            System.out.println("Cod pin incorect. Mai aveti " + contBancar.getIncercari() + " incercari ramase.");



        }
    }


    public void verificarePin(ContBancar contBancar) throws IncorrectPinException {
        while (contBancar.getIncercari() > 0) {

            introducereCodPin(contBancar);
            if(checkPin==true){  //valoare atribuita verificata pentru iesire din bucla

                break;

            }
            if (contBancar.getIncercari() == contBancar.getIndex()) {

                throw new IncorrectPinException();


            }
        }
    }
}
