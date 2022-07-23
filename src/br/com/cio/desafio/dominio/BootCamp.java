package br.com.cio.desafio.dominio;

import com.sun.source.doctree.SeeTree;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> desvsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDesvsIncritos() {
        return desvsIncritos;
    }

    public void setDesvsIncritos(Set<Dev> desvsIncritos) {
        this.desvsIncritos = desvsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(desvsIncritos, bootCamp.desvsIncritos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, desvsIncritos, conteudos);
    }
}
