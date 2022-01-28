package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("desdrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("desdrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");;
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);


        Dev devZou = new Dev();
        devZou.setNome("Zou Tomas");
        devZou.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Zou: " + devZou.getConteudosInscritos());

        devZou.progredir();
        devZou.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Zou: " + devZou.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Zou: " + devZou.getConteudosConcluidos());
        System.out.println("XP: " + devZou.calcularTotalXp());


        System.out.println("--------");

        Dev devRichard = new Dev();
        devRichard.setNome("Richard");
        devRichard.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Richard: " + devRichard.getConteudosInscritos());

        devRichard.progredir();
        devRichard.progredir();
        devRichard.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Richard: " + devRichard.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Richard: " + devRichard.getConteudosConcluidos());
        System.out.println("XP: " + devRichard.calcularTotalXp());

    }
}
