package com.mybelt.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorDePresenca {

    public List<Presenca> presencas;

    ControladorDePresenca(){
        presencas = new ArrayList<Presenca>();
    }

    public void add(Presenca presenca) {
        presencas.add(presenca);
    }


    public final Presenca getPresenca(Aluno aluno) {
        return this.presencas
                .stream()
                .filter(presenca -> presenca.getAluno().equals(aluno))
                .collect(Collectors.toList()).get(0);
    }
}
