package com.java.controller;


import com.java.dto.ContBancar;
import com.java.service.*;
import com.java.utils.IncorrectPinException;

public class ComenziControllerImpl implements ComenziController {

    private CreareContService creareContService;
    private AlimentareService alimentareService;
    private RetragereService retragereService;
    private SchimbarePinService schimbarePinService;

    private IstoricService istoricService;
    private TranzactiiService tranzactiiService;

    public ComenziControllerImpl() {
        creareContService = new CreareContServiceImpl();
        alimentareService = new AlimentareServiceImpl();
        retragereService = new RetragereServiceImpl();
        schimbarePinService = new SchimbarePinServiceImpl();
        istoricService = new IstoricServiceImpl();
        tranzactiiService = new TranzactiiServiceImpl();
    }

    public void creareCont(ContBancar contBancar) {
        creareContService.creareCont(contBancar);
    }

    public void alimentare(ContBancar contBancar) throws IncorrectPinException {
        alimentareService.alimentare(contBancar);
    }

    public void retragere(ContBancar contBancar) throws IncorrectPinException {
        retragereService.retragere(contBancar);
    }

    public void schimbarePin(ContBancar contBancar) throws IncorrectPinException {
        schimbarePinService.schimbarePin(contBancar);
    }

    public void istoric(ContBancar contBancar) {
        istoricService.istoric(contBancar);
    }

    public void tranzactii(ContBancar contBancar) {
        tranzactiiService.tranzactii(contBancar);
    }
}
