package org.example;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Exercicio6 {
    public static boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    public static boolean validarTelefone(String telefone) {
        String regex = "^\\(?(\\d{2})\\)?[- .]?(\\d{4,5})[- .]?(\\d{4})$";
        return Pattern.matches(regex, telefone);
    }

    public static boolean validarPonto(String ponto) {
        String regex = "^\\d{1,2}\\.\\d{1,2}$";
        return Pattern.matches(regex, ponto);
    }

    public static void main(String[] args) {
        String email = "usuario@exemplo.com";
        String telefone = "(31) 12345-6789";
        String ponto = "10.5";

        System.out.println("Validação de e-mail:");
        System.out.println("E-mail " + email + " é válido? " + validarEmail(email));

        System.out.println("Validação de telefone:");
        System.out.println("Telefone " + telefone + " é válido? " + validarTelefone(telefone));

        System.out.println("Validação de ponto:");
        System.out.println("Ponto " + ponto + " é válido? " + validarPonto(ponto));
    }
}
