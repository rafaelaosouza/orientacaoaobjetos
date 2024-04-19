package org.example;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x do primeiro ponto:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y do primeiro ponto:"));

        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x do segundo ponto:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y do segundo ponto:"));

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        JOptionPane.showMessageDialog(null, "A distância entre os pontos é: " + distance);
    }
}