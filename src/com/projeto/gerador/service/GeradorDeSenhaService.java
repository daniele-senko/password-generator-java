package com.projeto.gerador.service;
import com.projeto.gerador.model.ConfiguracaoSenha;
import java.util.Random;


public class GeradorDeSenhaService {
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIAIS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

    public static String gerarSenha(ConfiguracaoSenha config) {
        StringBuilder caracteresDisponiveis = new StringBuilder();

        if(config.isIncluirMaiusculas()) caracteresDisponiveis.append(MAIUSCULAS);
        if(config.isIncluirMinusculas()) caracteresDisponiveis.append(MINUSCULAS);
        if(config.isIncluirNumeros()) caracteresDisponiveis.append(NUMEROS);
        if(config.isIncluirEspeciais()) caracteresDisponiveis.append(ESPECIAIS);

        Random random = new Random();
        StringBuilder senha = new StringBuilder();

        for(int i = 0; i < config.getComprimento(); i++) {
            int indexAleatorio = random.nextInt(caracteresDisponiveis.length());
            senha.append(caracteresDisponiveis.charAt(indexAleatorio));
        }

        return senha.toString();
    }

}
