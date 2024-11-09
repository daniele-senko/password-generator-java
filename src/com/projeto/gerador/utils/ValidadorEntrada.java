package com.projeto.gerador.utils;

import com.projeto.gerador.model.ConfiguracaoSenha;

public class ValidadorEntrada {
    public static boolean validarConfiguracao(ConfiguracaoSenha config) {

        if (config.getComprimento() <= 0) {
            System.out.println("Erro: o comprimento deve ser maior que zero.");
            return false;
        }

        if(!config.isIncluirMaiusculas() && !config.isIncluirMinusculas() && !config.isIncluirNumeros() && !config.isIncluirEspeciais()) {
            System.out.println("Erro: deve-se escolher pelo menos um tipo de caractere.");
            return false;
        }

        return true;
    }
}
