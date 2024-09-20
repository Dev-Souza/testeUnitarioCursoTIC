package com.example.teste.meuPacote;

public class ManipuladorDeStrings {
    public String recortaTexto(String texto, int tamanho) {
        if(tamanho < 0) throw  new RuntimeException("O tamanho não pode ser menor que zero");
        if(tamanho > texto.length()) return texto;

        //substring = lugar que quer começar e lugar que quer terminar
        String resultado = texto.substring(0, tamanho);
        resultado = resultado + "...";
        return resultado;
    }
}
