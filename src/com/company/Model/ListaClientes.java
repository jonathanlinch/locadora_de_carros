package com.company.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaClientes {

    private static ArrayList<Cliente> listaCliente = new ArrayList<>();

    public static ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    static public void adicionarCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }

    static public String listarClientes() {
        String saidaCliente = "";
        int i = 1;
        for (Cliente cliente : listaCliente) {
            saidaCliente += "\n+++++ Cliente n° " + (i++) + "+++++\n";
            saidaCliente += cliente.imprimir() + "\n";
        }
        return saidaCliente;
    }

    Scanner entrada = new Scanner(System.in);
    String nome;
    String cpf;
    String rg;
    List<Cliente> client = new ArrayList<>();

    public void novoCliente() {

        Cliente cliente = new Cliente(nome, cpf, rg);


    }
}
