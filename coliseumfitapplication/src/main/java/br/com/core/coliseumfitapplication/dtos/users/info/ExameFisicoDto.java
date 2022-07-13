package br.com.core.coliseumfitapplication.dtos.users.info;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;

public class ExameFisicoDto {

    private Integer Id;

    private double peso;
    private double altura;

    private AlunoDto alunoDto;

    public ExameFisicoDto() {
    }

    public ExameFisicoDto(Integer id, double peso, double altura, AlunoDto alunoDto) {
        Id = id;
        this.peso = peso;
        this.altura = altura;
        this.alunoDto = alunoDto;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public AlunoDto getAlunoDto() {
        return alunoDto;
    }

    public void setAlunoDto(AlunoDto alunoDto) {
        this.alunoDto = alunoDto;
    }
}
