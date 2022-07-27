package br.com.core.coliseumfitapplication.model.matricula;

public enum StatusMatricula {
    Ativa("Ativa"),
    Pendente("Pendente"),
    Inativa("Inativa");

    private String status;

    StatusMatricula(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}
