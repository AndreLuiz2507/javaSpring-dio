package br.com.cio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

   private LocalDate cargaHoraria;


   @Override
   public double calculaXp() {
      return XP_PADRAO + 12d;
   }

   public LocalDate getCargaHoraria() {
      return cargaHoraria;
   }

   public void setCargaHoraria(LocalDate cargaHoraria) {
      this.cargaHoraria = cargaHoraria;
   }

   @Override
   public String toString() {
      return "Mentoria{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", cargaHoraria=" + cargaHoraria +
              '}';
   }


}
