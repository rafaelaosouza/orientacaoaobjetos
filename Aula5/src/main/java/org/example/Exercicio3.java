package org.example;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void verificarSituacao(double notaFinal, int numFaltas, int numTarefasRealizadas) {
        final int totalAulas = 60;
        final int totalTarefas = 45;
        double percentualFrequencia = ((double) (totalAulas - numFaltas) / totalAulas) * 100;

        if (percentualFrequencia >= 75) {
            if (notaFinal >= 60) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("O aluno tem direito de fazer a prova substitutiva");
            }
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    public static void main(String[] args) {
        double[] notasFinais = {75, 55, 65};
        int[] faltas = {5, 15, 30};
        int[] tarefasRealizadas = {40, 45, 30};

        for (int i = 0; i < 3; i++) {
            System.out.println("Situação do Aluno " + (i + 1) + ":");
            verificarSituacao(notasFinais[i], faltas[i], tarefasRealizadas[i]);
            System.out.println();
        }
    }
}
