package org.example;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double investimentoMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento mensal:"));
        double taxaJurosMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de juros mensal (em porcentagem):")) / 100;

        double saldo = 0;
        int ano = 1;

        boolean continuar = true;

        while (continuar) {
            for (int i = 0; i < 12; i++) {
                saldo *= (1 + taxaJurosMensal);
                saldo += investimentoMensal;
            }

            JOptionPane.showMessageDialog(null, "Saldo do investimento após " + ano + " ano: " + saldo);

            ano++;

            String resposta = JOptionPane.showInputDialog("Deseja processar mais um ano? (S/N)");
            continuar = resposta.equalsIgnoreCase("S");
        }
    }
}
