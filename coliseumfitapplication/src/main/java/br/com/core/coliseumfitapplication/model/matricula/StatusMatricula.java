package br.com.core.coliseumfitapplication.model.matricula;

public enum StatusMatricula {
    Ativa("Matricula Ativa"),
    Pendente("Pagamento de matricula pendente"),
    Inativa("Matricula cancelada");

    private String status;

    StatusMatricula(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}
