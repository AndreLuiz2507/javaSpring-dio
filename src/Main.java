import br.com.cio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso = new Curso();
      curso.setTitulo("CursoJS");
      curso.setDescricao("JS para paginas dinamicas");
      curso.setCargaHoraria(30);

        Mentoria men = new Mentoria();
        men.setTitulo("BootCamp");
        men.setDescricao("Java POO");
        men.setCargaHoraria(LocalDate.now());
        men.calculaXp();

        BootCamp camp = new BootCamp();
        camp.setNome("Bootcamp JAVA");
        camp.setDescricao("Bootcamp Java developer");
        camp.getConteudos().add(curso);
        camp.getConteudos().add(curso);
        camp.getConteudos().add(men);

        Dev dev1 = new Dev();
        dev1.setNome("André");
        dev1.inscreverBootcamp(camp);
        System.out.println("Conteudo Inscrto Dev1 :"+dev1.getConteudoIncristo());
        dev1.calculaXP();
        dev1.progradir();
        dev1.progradir();
        dev1.progradir();

        System.out.println("Conteudo concluidos Dev1 :"+dev1.getConteudoConcluido());



    }
}
