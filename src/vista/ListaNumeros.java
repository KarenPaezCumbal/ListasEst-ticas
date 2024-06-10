/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ListaNumeros {

  
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        int[] numero = new int[100];
        int numeroUsuario;
        int contador = 0;
        int numeroDivisible;
        
        for (int i = 0; i < 100; i++) {
            numero[i] = i + 1;
        }
  
        System.out.println("Ingrese un número entre 2 y 7:");
        numeroUsuario = es.nextInt();
        while (numeroUsuario < 2 || numeroUsuario > 7) {
            System.out.println("Número no válido ingrese un número entre 2 y 7:");
            numeroUsuario = es.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            if (numero[i] % numeroUsuario == 0) {
                contador++;
            }
        }
        int[] divisible = new int[contador];
        int indice = 0;
        for (int i = 0; i < 100; i++) {
            if (numero[i] % numeroUsuario == 0) {
                divisible[indice] = numero[i];
                indice++;
            }
        }
        System.out.print("Lista de números divisibles por " + numeroUsuario + ": ");
        for (int i = 0; i < divisible.length; i++) {
            numeroDivisible = divisible[i];
            System.out.print(numeroDivisible + " ");
        }
        System.out.println();
    }
}