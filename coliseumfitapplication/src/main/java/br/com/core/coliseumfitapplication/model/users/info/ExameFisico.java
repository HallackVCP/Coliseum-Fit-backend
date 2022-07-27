package br.com.core.coliseumfitapplication.model.users.info;


import br.com.core.coliseumfitapplication.model.users.Aluno;

import javax.persistence.*;

@Entity
@Table(name = "tb_exames_fisicos")
public class ExameFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private double peso;
    private double altura;

    @OneToOne
    private Aluno aluno;



    public ExameFisico() {
    }



    public ExameFisico(Integer Id, double peso, double altura) {
        this.Id = Id;
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExameFisico that = (ExameFisico) o;

        return Id == that.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
