package com.example.teste.meuPacoteTests;

import com.example.teste.meuPacote.ManipuladorDeStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManipuladorDeStringsTests {
    @Test
    void recortaTextoQuandoTamanhoForMenorQueZeroJogaExcecao(){
        // configuração
        ManipuladorDeStrings manipulador = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = -1;

        //execução
        Assertions.assertThrows(RuntimeException.class, () -> manipulador.recortaTexto(texto, tamanho));
    }

    @Test
    void recortaTextoRetornaProprioTextoQuandoTamanhoMaiorTamanhoTexto() {
        //Configuração
        ManipuladorDeStrings manipulador = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela a parede";
        int tamanho = 60;

        //Execução
        Assertions.assertEquals(texto, manipulador.recortaTexto(texto, tamanho));
    }

    @Test
    void recortaTextoRetornaTextoRecortadoComReticenciasCasoTamanhoSejaValido(){
        //configuração
        ManipuladorDeStrings manipulador = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela a parede";
        int tamanho = 13;

        //execução
        Assertions.assertEquals("A dona aranha...", manipulador.recortaTexto(texto, tamanho));
    }
}
