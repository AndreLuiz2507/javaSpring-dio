package br.com.cio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    /**/

    private String nome;
    private Set<Conteudo> conteudoIncristo = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(BootCamp bootcamp){
      this.conteudoIncristo.addAll(bootcamp.getConteudos());
      bootcamp.getDesvsIncritos().add(this);
    }
    public void progradir() {
        Optional<Conteudo> cont = this.conteudoIncristo.stream().findFirst();
        if (cont.isPresent()) {
            this.conteudoConcluido.add(cont.get());
            this.conteudoIncristo.remove(cont.get());
        } else {
            System.err.println("Não existe escrição para os cursos");
        }
    }

    public double calculaXP(){
        return this.conteudoConcluido
                .stream()
                .mapToDouble(value ->  Conteudo.XP_PADRAO).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoIncristo() {
        return conteudoIncristo;
    }

    public void setConteudoIncristo(Set<Conteudo> conteudoIncristo) {
        this.conteudoIncristo = conteudoIncristo;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoIncristo, dev.conteudoIncristo) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoIncristo, conteudoConcluido);
    }
}
