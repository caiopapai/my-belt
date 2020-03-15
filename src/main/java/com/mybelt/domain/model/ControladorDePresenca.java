package com.mybelt.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorDePresenca {

    public List<Presenca> presencas;

    ControladorDePresenca(){
        presencas = new ArrayList<Presenca>();
    }

    public void adicionaPresenca(Presenca presenca) {
        presencas.add(presenca);
    }


    public final int getQuantidadeDePresencas(Aluno aluno) {
        return (int) this.presencas
                .stream()
                .filter(presenca -> presenca.getAluno().equals(aluno)).count();
    }

    public void removePresenca(Presenca presenca) {
        this.presencas.remove(presenca);
    }

    public void adicionaPresencas(List<Presenca> presencas) {
        this.presencas.addAll(presencas);
    }
}
