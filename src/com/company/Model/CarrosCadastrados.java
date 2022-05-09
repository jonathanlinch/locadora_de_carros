package com.company.Model;

import java.util.ArrayList;

public class CarrosCadastrados {
    private static ArrayList<Carro> listaCarros =  new ArrayList<>();

    public static ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }
    static public void adicionar(Carro l){
        listaCarros.add(l);
    }
    static public String listar(){
        String saida = "";
        int i = 1;
        for (Carro l : listaCarros){
            saida += "\n====== Carro n° "+ (i++) + "=======\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }
}
