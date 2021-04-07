package com.java.utils;

import java.util.Scanner;

public class ScannerWrapper {
    private static Scanner tastatura = new Scanner(System.in);

    public static  String next(){  // pentru codul pin, NumeServiciuAles
        return tastatura.next();
    }

    public static float nextFloat(){  // pentru sold
        return tastatura.nextFloat();
    }


    public static boolean hasNext() {
        return true;
    }
}
