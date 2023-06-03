package org.example;

public class ClientePF extends Cliente {
    private String CPF;

    public ClientePF(String nome, String email, String endereco, String CPF) {
        super(nome, email, endereco);
        this.CPF = CPF;
    }
    @Override
    public String getId(){
        return this.CPF;
    }
}
