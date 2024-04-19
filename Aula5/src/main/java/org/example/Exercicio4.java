package org.example;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int anterior = 1;
        int atual = 1;
        for (int i = 2; i < n; i++) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para calcular a série de Fibonacci:"));

        JOptionPane.showMessageDialog(null, "Verifique a série de Fibonacci até " + numero + " no terminal.");

        System.out.println("Série de Fibonacci até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }
}
