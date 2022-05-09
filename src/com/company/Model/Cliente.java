package com.company.Model;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private String cpf;
    private String rg;

    Cliente(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
}
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;}

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }
    public String getRg() {

        return rg;
    }

    public void setRg(String rg) {

        this.rg = rg;
    }
    public String imprimir(){
        System.out.println("#####-Cadastro de clientes-#####");
        return "\nNome: " + nome +
                "\nCPF: "+ cpf +
                "\nRG: "+ rg +
                "\n";
    }
}
