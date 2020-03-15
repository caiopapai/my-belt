package com.mybelt.domain.model;

import java.util.AbstractList;
import java.util.Objects;

public class Presenca {

    private int id;
    private Aluno aluno;
    private Boolean presente = false;


    public Presenca(Aluno aluno) {
        this.aluno = aluno;
        this.presente = true;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Presenca){
            Presenca casting = (Presenca) obj;
            boolean temMesmoNome = this.getAluno().getNome().equals(casting.getAluno().getNome());
            boolean temMesmoId = this.id == casting.getId();
            boolean mesmaPresenca = temMesmoNome && temMesmoId;
            return mesmaPresenca;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, presente);
    }
}
