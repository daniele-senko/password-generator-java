package com.projeto.gerador;

import com.projeto.gerador.model.ConfiguracaoSenha;
import com.projeto.gerador.service.GeradorDeSenhaService;
import com.projeto.gerador.utils.ValidadorEntrada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento desejado para a senha: ");
        int comprimento = scanner.nextInt();

        System.out.println("Incluir letras maiúsculas? (s/n): ");
        boolean incluirMaiusculas = scanner.next().equalsIgnoreCase("s");

        System.out.println("Incluir minúsculas? (s/n): ");
        boolean incluirMinusculas = scanner.next().equalsIgnoreCase("s");

        System.out.println("Incluir números? (s/n): ");
        boolean incluirNumeros = scanner.next().equalsIgnoreCase("s");

        System.out.println("Incluir caracteres especiais? (s/n): ");
        boolean incluirEspeciais = scanner.next().equalsIgnoreCase("s");

        // configuração da senha
        ConfiguracaoSenha config = new ConfiguracaoSenha(comprimento, incluirMaiusculas, incluirMinusculas,
                incluirNumeros, incluirEspeciais);

        // validação das entradas
        if (!ValidadorEntrada.validarConfiguracao(config)) {
            System.out.println("Configuração inválida! Verifique as opções e tente novamente.");
            return;
        }

        // gerador de senha
        String senhaGerada = GeradorDeSenhaService.gerarSenha(config);
        System.out.println("Senha gerada: " + senhaGerada);
    }
}