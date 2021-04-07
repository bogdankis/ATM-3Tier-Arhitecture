package com.java.repository;



import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;
import com.java.utils.ScannerWrapper;
import com.java.utils.VerificatorDePin;

import java.util.InputMismatchException;
import java.util.UUID;

public class RetragereRepositoryImpl implements RetragereRepository {


    float sumaIntrodusa;

    public void retragere(ContBancar contBancar) throws IncorrectPinException {
        while (contBancar.getIncercari() > 0) {

            float soldClient = contBancar.getSoldClient();
            float soldDupa = contBancar.getSoldDupa();
            Tranzactii tranzactiiRepo;
            VerificatorDePin verificatorDePin;
            verificatorDePin = new VerificatorDePin();
            try {
                verificatorDePin.verificarePin(contBancar);
                contBancar.istoric.add("Retragere numerar");
                System.out.println("Introduceti suma pentru retragere:");
                while (ScannerWrapper.hasNext()) { //  secventa repetitiva verifica daca valoarea introdusa de la tastatura nu contine litere sau carcatere speciale,
                    try {
                        sumaIntrodusa = ScannerWrapper.nextFloat();
                        if (ScannerWrapper.hasNext()) { // daca este introdusa o suma in locul de caracterelor necunoscute iese din bucla si continua programul
                            break;
                        }
                    } catch (InputMismatchException inputMismatchException) { // inlatura tipul de valoare incorect
                        System.out.println("Caracter necunoscut. Introduceti suma dorita: ");
                        ScannerWrapper.next();
                    }
                }
                if (sumaIntrodusa > soldDupa) {
                    System.out.println("Fonduri insuficiente");
                    break;
                } else if (sumaIntrodusa <= soldDupa) {
                    contBancar.setSoldDupa(soldDupa - sumaIntrodusa);
                    tranzactiiRepo = new Tranzactii(contBancar.getSoldDupa(), soldClient - sumaIntrodusa, sumaIntrodusa, true, "Retragere");
                    contBancar.tranzactieHarta.put(contBancar.getId(UUID.randomUUID()), tranzactiiRepo);
                    System.out.println("Mai aveti in cont: " + contBancar.getSoldDupa() + " de lei.");
                }

            } catch (IncorrectPinException incorrectPinException) {
                tranzactiiRepo = new Tranzactii(soldClient, soldClient, 0, false, "Retragere");
                contBancar.tranzactieHarta.put(contBancar.getId(UUID.randomUUID()), tranzactiiRepo);
                System.out.println(incorrectPinException.getMessage());
            }

            break;  //inchidere intreaga operatie si revenire in meniul principal

        }
    }
}
