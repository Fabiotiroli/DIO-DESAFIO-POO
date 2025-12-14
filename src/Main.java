import domain.Bootcamp;
import domain.Curso;

import domain.Dev;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Curso curso1 = new Curso();
        curso1.setTitulo("curso1");
        curso1.setDescricao("Teste");
        curso1.setCargaHoraria(64);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso2");
        curso2.setDescricao("Teste");
        curso2.setCargaHoraria(64);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso2");
        curso3.setDescricao("Teste");
        curso3.setCargaHoraria(64);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDataLancamento(LocalDate.now());
        mentoria.setDataLancamento(LocalDate.of(2025, 12, 25));
        mentoria.setDescricao("teste");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp1");
        bootcamp.setDescricao("Bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

        bootcamp.getConteudos().add(mentoria);

        System.out.println("DEV1");
        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");

        dev1.increverBootcampo(bootcamp);
        System.out.println("------------------------------------");
        System.out.println(dev1.getConteudosInscritos());
        System.out.println("------------------------------------");
        dev1.progredir();
        System.out.println("------------------------------------");
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println("------------------------------------");
        System.out.println("Calcula XP: " + dev1.calcularTotalXP());


        System.out.println("DEV2");
        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.increverBootcampo(bootcamp);
        System.out.println("----------------inscritos--------------------");
        System.out.println(dev1.getConteudosInscritos());
        dev2.progredir();
        System.out.println("------------concluido1------------------------");
        System.out.println(dev1.getConteudosConcluidos());
        dev2.progredir();
        System.out.println("------------concluidos 2------------------------");
        System.out.println(dev1.getConteudosConcluidos());

        System.out.println("Calcula XP: " + dev2.calcularTotalXP());




    }
}