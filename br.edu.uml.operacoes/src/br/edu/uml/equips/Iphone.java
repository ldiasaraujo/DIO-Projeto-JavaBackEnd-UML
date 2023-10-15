package br.edu.uml.equips;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public static void main(String[] args) {
        Iphone iphone17 = new Iphone();
        iphone17.tocar();
        iphone17.atender();
        iphone17.atualizarPagina();
        iphone17.ligar();
        iphone17.iniciarCorreioVoz();
    }
}
