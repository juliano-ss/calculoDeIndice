
package com.mycompany.calculoindice;

import java.util.Scanner;

/**
 *
 * @author jotal
 */
public class CalculoIndice {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int INDICE;
        while (true) {
            System.out.print("Digite o valor do índice (deve ser um inteiro): ");
            if (leitor.hasNextInt()) {
                INDICE = leitor.nextInt();
                break;
            } else {
                System.out.println("Valor inválido, tente novamente.");
                leitor.next();
            }
        }

        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("A soma dos " + INDICE + " primeiros números inteiros é: " + SOMA);
    }

}