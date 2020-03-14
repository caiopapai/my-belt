package com.mybelt.domain.model;

import java.util.AbstractList;
import java.util.Objects;

public class Presenca {

    private Aluno aluno;
    private Boolean presente = false;

    public Presenca(Aluno aluno) {
        this.aluno = aluno;
        this.presente = true;
    }

    public Aluno getAluno() {
        return aluno;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Presenca){
            Presenca casting = (Presenca) obj;
            return this.getAluno().getNome().equals(casting.getAluno().getNome());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, presente);
    }
}
