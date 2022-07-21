import br.com.cio.desafio.dominio.Curso;
import br.com.cio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso = new Curso();
      curso.setTitulo("Java Develop");
      curso.setDescricao("POO");
      curso.setCargaHoraria(60);
      System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Fulano");
        mentoria.setDescricao("azevedo");
        mentoria.setCargaHoraria(LocalDate.now());
        System.out.println(mentoria);
    }
}
