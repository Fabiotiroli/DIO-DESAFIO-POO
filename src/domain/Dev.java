package domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Dev extends Conteudo {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void increverBootcampo(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());


    }

    public void progredir(){
        Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Aluno não matriculado no conteudo: " + conteudo);        }




    }

    public double calcularTotalXP() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::CalcularXP)
                .sum();
    }



    @Override
    public double CalcularXP() {
        return 0;
    }
}
