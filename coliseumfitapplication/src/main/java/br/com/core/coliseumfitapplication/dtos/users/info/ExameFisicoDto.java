package br.com.core.coliseumfitapplication.dtos.users.info;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;

public class ExameFisicoDto {

    private double peso;
    private double altura;




    public ExameFisicoDto() {
    }



    public ExameFisicoDto(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
