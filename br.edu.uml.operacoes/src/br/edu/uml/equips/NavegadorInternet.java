package br.edu.uml.equips;

public interface NavegadorInternet {
    default void exibirPagina(){
        System.out.println("Exibindo Pagina");
    }

    default void adicionarNovaAba(){
        System.out.println("Atualizando nova aba");
    }

    default void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }
}
