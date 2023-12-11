/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenadornumeros;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite vários números inteiros separados por espaços:");
        String input = scanner.nextLine();

        // Divida a entrada em uma matriz de strings
        String[] numerosString = input.split(" ");

        // Converta os strings para inteiros
        int[] numeros = new int[numerosString.length];
        for (int i = 0; i < numerosString.length; i++) {
            numeros[i] = Integer.parseInt(numerosString[i]);
        }

        // Ordene os números
        Arrays.sort(numeros);

        // Imprima os números ordenados
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
