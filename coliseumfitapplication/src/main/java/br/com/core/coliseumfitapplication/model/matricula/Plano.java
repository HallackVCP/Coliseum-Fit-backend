package br.com.core.coliseumfitapplication.model.matricula;

public enum Plano {

    Mensal("Mensal", 69.99),
    Trimestral("Trimestral", 199.99),
    Semestral("Semestral", 385.99),
    Anual("Anual", 720.00);


    private final String nome;

    private final double preco;

    Plano(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
