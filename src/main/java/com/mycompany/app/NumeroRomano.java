package com.mycompany.app;

public class NumeroRomano {

    public static String decToRomano(int numero) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder numeroRomano = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(numero >= values[i]) {
                numero -= values[i];
                numeroRomano.append(romanLiterals[i]);
            }
        }
        return numeroRomano.toString();
    }

}
