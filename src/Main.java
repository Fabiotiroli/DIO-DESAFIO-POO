import domain.Curso;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Curso curso = new Curso();
        curso.setTitulo("Curso 1");
        curso.setDescricao("Teste");
        curso.setCargaHoraria(64);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDataLancamento(LocalDate.now());
        mentoria.setDataLancamento(LocalDate.of(2025, 12, 25));
        mentoria.setDescricao("teste");

        System.out.println(mentoria);
        System.out.println(mentoria.getDescricao());
        System.out.println(mentoria.getDataLancamento());
        System.out.println(mentoria.getTitulo());


        System.out.println(curso);
        System.out.println(curso.getTitulo());
        System.out.println(curso.getDescricao());
        System.out.println(curso.getCargaHoraria());

    }
}