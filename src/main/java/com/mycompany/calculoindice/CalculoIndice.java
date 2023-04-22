
package com.mycompany.calculoindice;

import java.util.Scanner;

/**
 *
 * @author jotal
 */
public class CalculoIndice {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int INDICE = leitor.nextInt();
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }
}
