package com.company.Model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Carro carro;
        Cliente cliente;
        String categoria, transmissao, combustivel, marca, modelo, placa;
        int ano;
        int menu;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        ///cliente
        String nome,cpf,rg;

        do {
            exibirMenu();
            menu = entrada.nextInt();

            switch (menu){
                case 1:
                    System.out.println("###### -Cadastro de veículo- ######\n" +
                            "Vamos começar o cadastro do novo veículo.\n");
                    System.out.println("Digite a categoria: ");
                    categoria = entradaString.nextLine();
                    System.out.println("Digite o tipo de transmissão: ");
                    transmissao = entradaString.nextLine();
                    System.out.println("Digite o tipo de combustivel: ");
                    combustivel = entradaString.nextLine();
                    System.out.println("Digite a marca do veículo: ");
                    marca = entradaString.nextLine();
                    System.out.println("Digite o modelo: ");
                    modelo = entradaString.nextLine();
                    System.out.println("Digite a placa: ");
                    placa = entradaString.nextLine();
                    System.out.println("Digite o ano do veículo: ");
                    ano = entrada.nextInt();

                    carro = new Carro(categoria,transmissao,combustivel,marca,modelo,placa,ano);
                    //guardar
                    CarrosCadastrados.adicionar(carro);

                    break;
                case 2:
                    System.out.println("######### Vamos inicar seu cadastro #########\n" +
                            "Digite seu nome: ");
                    nome = entradaString.nextLine();
                    System.out.println("Digite seu CPF: ");
                    cpf = entradaString.nextLine();
                    System.out.println("Digite seu RG: ");
                    rg = entradaString.nextLine();

                    cliente = new Cliente(nome,cpf,rg);
                    //guardar
                    ListaClientes.adicionarCliente(cliente);
                    //System.out.println(nome + "\nCadastrado com sucesso!");

                    break;
                case 3:
                    System.out.println("######-Carros cadastrados-######");
                    System.out.println(CarrosCadastrados.listar());


                case 4:
                    System.out.println("######-Clientes cadastrados-######");
                    System.out.println(ListaClientes.listarClientes());

                default:
                    System.out.println("Opção de menu inválida!");

            }

        }while (menu != 5);{

        }
    }
    static void exibirMenu() {
        System.out.println(
                        "1)Cadastrar novo veículo\n" +
                        "2)Cadastrar novo cliente\n" +
                        "3)Locar um veículo\n" +
                        "4)Relátório de locação\n" +
                        "5)Sair\n" +
                        "\n\nEscolha uma das opções"
        );
    }
}
