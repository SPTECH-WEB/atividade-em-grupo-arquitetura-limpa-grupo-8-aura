package com.aura.risco_credito_api.core.domain;

public enum ClassificacaoRisco {
    ALTO("Risco Alto", "Contato telefônico em até 24h + análise crítica"),
    MEDIO("Risco Médio", "Análise manual em até 48h"),
    BAIXO("Risco Baixo", "Contato automático por e-mail");

    private final String descricao;
    private final String estrategiaContato;

    ClassificacaoRisco(String descricao, String estrategiaContato) {
        this.descricao = descricao;
        this.estrategiaContato = estrategiaContato;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEstrategiaContato() {
        return estrategiaContato;
    }
}
