package com.company.Model;

import java.util.Scanner;


public class DB {
    Menu menu = new Menu();

    public void verificaStatus() {
        Carro obj;

        NovoCarro novoCarro = new NovoCarro();
        ListaClientes cliente = new ListaClientes();
        int n;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        if (n == 1) {

        } else if (n == 2) {
            cliente.novoCliente();

        } else if (n == 3){
            System.out.println(CarrosCadastrados.listar());

        }
    }
}



