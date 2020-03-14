package com.mybelt.domain.model;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CrontoladorDePresencaTeste {


    @Test
    public void incluirPresencaParaAluno(){
        Aluno aluno = new Aluno("Nome do Aluno");
        Presenca presenca = new Presenca(aluno);
        ControladorDePresenca controlador = new ControladorDePresenca();
        controlador.add(presenca);

        Assert.assertEquals(presenca, controlador.getPresenca(aluno));

    }

}
