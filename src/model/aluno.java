package model;

public class aluno {
    String nome;
    int idade;
    double[] notas;

    public aluno(String nome, double[] notas, int idade) {
        this.nome = nome;
        this.notas = notas;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;

        }


        return soma / notas.length;

    }


    public boolean Aprovado() {
        return calculaMedia() >= 7;

    }

}

