package com.java.utils;

public class IncorrectPinException extends Throwable {
    public IncorrectPinException(){
        super("Numarul de incercari limita atinse. Va rugam incercati mai tarziu.");
    }

}
