package br.com.fiapride.model;

public class Faca {

    public String tamanho;
    public String materialDaLamina;
    public boolean afiado;

    public Faca(String tamanho, String materialDaLamina) {
        this.tamanho = tamanho;
        this.materialDaLamina = materialDaLamina;
        this.afiado = false;
    }

    public void cortarObjeto(String objeto) {
        if (objeto.equals("duro")) {
            System.out.println("A faca nao consegue cortar o objeto");
        } else if (objeto.equals("leve")) {
            System.out.println("A faca consegue cortar o objeto");
        }
    }

    public void afiarFaca() {
        this.afiado = true;
        System.out.println("A faca foi afiada!");
    }
}