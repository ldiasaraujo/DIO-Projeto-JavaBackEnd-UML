package br.edu.uml.equips;

public interface ReprodutorMusical {
    default void tocar(){
        System.out.println("Tocando");
    }

    default void pausar(){
        System.out.println("Pausando");
    }

    default void selecionarMusica(){
        System.out.println("Selecionando Musica");
    }
}
