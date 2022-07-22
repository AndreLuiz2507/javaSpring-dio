import br.com.cio.desafio.dominio.Conteudo;
import br.com.cio.desafio.dominio.Curso;
import br.com.cio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso = new Curso();

      curso.setCargaHoraria(60);
      System.out.println(curso);

        Conteudo con = new Mentoria();

        con.setTitulo("BootCamp");
        con.setDescricao("Java POO");
        con.calculaXp();

        System.out.println(con);


    }
}
