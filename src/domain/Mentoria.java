package domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{


    private LocalDate dataLancamento;


    public Mentoria() {}


    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }

    @Override
    public double CalcularXP() {
        return 0;
    }
}
