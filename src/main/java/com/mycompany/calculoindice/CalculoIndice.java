/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculoindice;

/**
 *
 * @author jotal
 */
public class CalculoIndice {

    public static void main(String[] args) {
       
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

       
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

       
        System.out.println(SOMA);
    }
}
