package com.company.Model;

public class Carro {

        private String categoria;
        private String transmissao;
        private String combustivel;
        private String marca;
        private String modelo;
        private String placa;
        private int ano;

        public Carro() {
        }

        public Carro(String categoria,
                     String transmissao,
                     String combustivel,
                     String marca,
                     String modelo,
                     String placa,
                     int ano)
                     {

                this.categoria = categoria;
                this.transmissao = transmissao;
                this.combustivel = combustivel;
                this.marca = marca;
                this.modelo = modelo;
                this.placa = placa;
                this.ano = ano;
        }

        String[] transmissaoDis = {"0-Manual", "1-Automática"};
        String[] combustivelDis = {
                "0-Álcool",
                "1-Gasolina",
                "2-Flex",
                "3-GNV",
                "4-Diesel"};

       public String getCategoria() {

                return categoria;
        }

        public void setCategoria(String categoria) {

                this.categoria = categoria;
        }

        public String getTransmissao() {

                return transmissao;
        }

        public void setTransmissao(String transmissao) {

                this.transmissao = transmissao;
        }

        public String getCombustivel() {

                return combustivel;
        }

        public void setCombustivel(String combustivel) {

                this.combustivel = combustivel;
        }

        public String getMarca() {

                return marca;
        }

        public void setMarca(String marca) {

                this.marca = marca;
        }

        public String getModelo() {

                return modelo;
        }

        public void setModelo(String modelo) {

                this.modelo = modelo;
        }

        public int getAno() {

                return ano;
        }

        public void setAno(int ano) {

                this.ano = ano;
        }

        public String getPlaca() {
                return placa;
        }

        public void setPlaca(String placa) {

                this.placa = placa;
        }

        public String imprimir(){
                //System.out.println("#####-Cadastro de veículos-#####");
                return "\nCategoria: "+ categoria +
                        "\nTransmissão: "+ transmissao +
                        "\nCombustível: "+ combustivel +
                        "\nMarca: "+ marca +
                        "\nModelo: "+ modelo +
                        "\nAno: "+ ano +
                        "\nPlaca:" + placa;
        }
}

