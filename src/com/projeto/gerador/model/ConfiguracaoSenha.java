package com.projeto.gerador.model;

public class ConfiguracaoSenha {
    
    private int comprimento;
    private boolean incluirMaiusculas;
    private boolean incluirMinusculas;
    private boolean incluirNumeros;
    private boolean incluirEspeciais;

    public ConfiguracaoSenha(int comprimento, boolean incluirMaiusculas, boolean incluirMinusculas, boolean incluirNumeros, boolean incluirEspeciais) {
        this.comprimento = comprimento;
        this.incluirMaiusculas = incluirMaiusculas;
        this.incluirMinusculas = incluirMinusculas;
        this.incluirNumeros = incluirNumeros;
        this.incluirEspeciais = incluirEspeciais;
    }

    public int getComprimento() { return comprimento; }
    public boolean isIncluirMaiusculas() { return incluirMaiusculas; }
    public boolean isIncluirMinusculas() { return incluirMinusculas; }
    public boolean isIncluirNumeros() { return incluirNumeros; }
    public boolean isIncluirEspeciais() { return incluirEspeciais; }
}
