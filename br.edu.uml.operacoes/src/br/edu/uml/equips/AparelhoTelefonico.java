package br.edu.uml.equips;

public interface AparelhoTelefonico {
    default void ligar(){
        System.out.println("Ligando");
    }

    default void atender(){
        System.out.println("Atendendo");
    }

    default void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
