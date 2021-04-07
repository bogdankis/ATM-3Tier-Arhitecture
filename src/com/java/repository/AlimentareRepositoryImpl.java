package com.java.repository;



import com.java.dto.ContBancar;
import com.java.utils.IncorrectPinException;
import com.java.utils.ScannerWrapper;
import com.java.utils.VerificatorDePin;

import java.util.InputMismatchException;
import java.util.UUID;

public class AlimentareRepositoryImpl implements AlimentareRepository {

    float sumaIntrodusa;

    public void alimentare(ContBancar contBancar) throws InputMismatchException, IncorrectPinException {
        while (contBancar.getIncercari() > 0) {

            float soldClient = contBancar.getSoldClient();
            Tranzactii tranzactiiRepo;
            VerificatorDePin verificatorDePin;
            verificatorDePin = new VerificatorDePin();
            try {
                verificatorDePin.verificarePin(contBancar);

                contBancar.istoric.add("Alimentare");
                System.out.println("Introduceti suma pentru alimentare:");
                while (ScannerWrapper.hasNext()) { //  secventa repetitiva verifica daca valoarea introdusa de la tastatura nu contine litere sau caracatere speciale,
                    try {
                        sumaIntrodusa = ScannerWrapper.nextFloat();
                        if (ScannerWrapper.hasNext()) { //
                            break;
                        }
                    } catch (InputMismatchException inputMismatchException) { // inlatura tipul de valoare incorect
                        System.out.println("Caracter necunoscut. Introduceti suma dorita: ");
                        ScannerWrapper.next();
                    }
                }
                contBancar.setSoldDupa(soldClient + sumaIntrodusa);
                tranzactiiRepo = new Tranzactii(soldClient, soldClient + sumaIntrodusa, sumaIntrodusa, true, "Alimentare");
                contBancar.tranzactieHarta.put(contBancar.getId(UUID.randomUUID()), tranzactiiRepo);
                contBancar.setSoldClient(contBancar.getSoldDupa());
                System.out.println("Tranzactie reusita!!!. Ati alimentat contul cu " + contBancar.getSoldDupa() + " de lei");
            } catch (IncorrectPinException incorrectPinException) {
                if (contBancar.getIncercari() == contBancar.getIndex()) {
                    tranzactiiRepo = new Tranzactii(soldClient, soldClient, 0, false, "Alimentare");
                    contBancar.tranzactieHarta.put(contBancar.getId(UUID.randomUUID()), tranzactiiRepo);
                }
                System.out.println(incorrectPinException.getMessage());
            }
            break; //inchidere intreaga operatie si revenire in meniul principal
        }
    }
}
