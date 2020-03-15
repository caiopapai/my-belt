package com.mybelt.domain.model;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CrontoladorDePresencaTeste {

    @Test
    public void maisDeUmaPresencaDoAluno(){

        Aluno aluno = new Aluno("Nome do Aluno");

        List<Presenca> presencas = new ArrayList<Presenca>();
        presencas.add(new Presenca(aluno));
        presencas.add(new Presenca(aluno));

        ControladorDePresenca controlador = new ControladorDePresenca();
        controlador.adicionaPresencas(presencas);

        Assert.assertEquals(2, controlador.getQuantidadeDePresencas(aluno));
    }

    @Test
    public void incluiMaisDeUmaListaDePresencas(){

        Aluno aluno = new Aluno("Nome do Aluno");

        List<Presenca> presencas = new ArrayList<Presenca>();
        presencas.add(new Presenca(aluno));
        presencas.add(new Presenca(aluno));

        ControladorDePresenca controlador = new ControladorDePresenca();
        controlador.adicionaPresencas(presencas);

        List<Presenca> novasPresencas = new ArrayList<Presenca>();
        novasPresencas.add(new Presenca(aluno));
        novasPresencas.add(new Presenca(aluno));

        controlador.adicionaPresencas(novasPresencas);


        Assert.assertEquals(4, controlador.getQuantidadeDePresencas(aluno));
    }

    @Test
    public void alunoSemPresenca(){

        Aluno aluno = new Aluno("Nome do Aluno");

        ControladorDePresenca controlador = new ControladorDePresenca();

        Assert.assertEquals(0, controlador.getQuantidadeDePresencas(aluno));

    }

    @Test
    public void removerUmaPresencaDoAluno(){
        Aluno aluno = new Aluno("Nome do Aluno");

        Presenca presenca = new Presenca(aluno);

        ControladorDePresenca controlador = new ControladorDePresenca();
        controlador.removePresenca(presenca);

        Assert.assertEquals(0, controlador.getQuantidadeDePresencas(aluno));
    }

    @Test
    public void removerUmaPresencaQuandoAlunoTemMaisDeUma(){
        Aluno aluno = new Aluno("Nome do Aluno");

        Presenca presencaUm = new Presenca(aluno);
        presencaUm.setId(1);

        Presenca presencaDois = new Presenca(aluno);
        presencaDois.setId(2);

        ControladorDePresenca controlador = new ControladorDePresenca();
        controlador.adicionaPresenca(presencaUm);
        controlador.adicionaPresenca(presencaDois);

        controlador.removePresenca(presencaUm);

        Assert.assertEquals(1, controlador.getQuantidadeDePresencas(aluno));
    }
}
