package br.com.fiapride.main;

import br.com.fiapride.model.Faca;

public class SistemaFacaPrincipal {
    public static void main(String[] args) {
        Faca minhaFaca = new Faca("Pequeno", "Plastico");
        minhaFaca.materialDaLamina = "Plastico";
        minhaFaca.tamanho = "Pequeno";
        minhaFaca.afiado = false;


        Faca facaDoCozinheiro = new Faca("Grande","Aço");
        facaDoCozinheiro.materialDaLamina = "Aço";
        facaDoCozinheiro.tamanho = "Grande";
        facaDoCozinheiro.afiado = true;



        System.out.println("A lamina da minha faca é feita de "+ minhaFaca.materialDaLamina + " |O tamanho da minha faca é " + minhaFaca.tamanho );
        System.out.println("A lamina da faca do cozinheiro é feita de "+ facaDoCozinheiro.materialDaLamina + "| O tamanho da faca do cozinheiro é "+ facaDoCozinheiro.tamanho);
        System.out.println("---------------------------------------------------------------------------------------");
        if(minhaFaca.afiado =true){
            System.out.println("A minha Faca é afiada");
        }else {
            System.out.println("A minha faca nao é afiada");

        }
        if(facaDoCozinheiro.afiado = true){
            System.out.println("A faca do cozinheiro é afiado");
        }else{
            System.out.println("A faca do cozineiro nao é afiado");
        }
    }

}