package org.example;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        double memoria = 0;

        while (true) {
            String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão", "Finalizar programa"};

            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            double resultado = 0;
            switch (escolha) {
                case 0: // Soma
                    double soma = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser somado a " + memoria + ":"));
                    resultado = memoria + soma;
                    break;
                case 1: // Subtração
                    double subtracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser subtraído de " + memoria + ":"));
                    resultado = memoria - subtracao;
                    break;
                case 2: // Multiplicação
                    double multiplicacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser multiplicado por " + memoria + ":"));
                    resultado = memoria * multiplicacao;
                    break;
                case 3: // Divisão
                    double divisao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pelo qual dividir " + memoria + ":"));
                    if (divisao != 0) {
                        resultado = memoria / divisao;
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                        continue; // Reiniciar o loop sem atualizar a memória
                    }
                    break;
                case 4: // Finalizar programa
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    return; // Sair do método main e encerrar o programa
            }

            memoria = resultado;

            JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado);
        }
    }
}
