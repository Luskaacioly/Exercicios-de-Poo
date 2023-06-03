package org.example;

public abstract class ClientePJ {
    private String CNPJ;

    public ClientePJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    public  String getId() {
        return CNPJ;
    }
}
